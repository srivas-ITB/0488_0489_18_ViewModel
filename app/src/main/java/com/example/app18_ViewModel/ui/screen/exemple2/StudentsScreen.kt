package com.example.app18_ViewModel.ui.screen.exemple2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Exemple2_StudentScreen(modifier: Modifier) {
    val studentsViewModel = viewModel<StudentsViewModel>()
    val studentName: String by studentsViewModel.studentName.collectAsStateWithLifecycle()
    val studentCourse: String by studentsViewModel.studentCourse.collectAsStateWithLifecycle()
    val studentGrade: String by studentsViewModel.studentGrade.collectAsStateWithLifecycle()

    Column(modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = studentName, label = { Text("Nom") },
            onValueChange = { studentsViewModel.editStudentName(it) })
        TextField(
            value = studentCourse, label = { Text("Curs") },
            onValueChange = { studentsViewModel.editStudentCourse(it) })
        TextField(
            value = studentGrade, label = { Text("Nota") },
            onValueChange = { studentsViewModel.editStudentGrade(it) })
        Button(onClick = {
            studentsViewModel.updateStudent(studentName, studentCourse, studentGrade)
        }) { Text("Guardar canvis") }
        Button(onClick = {
            studentsViewModel.getNextStudent()
        }) { Text("Següent alumne") }
    }

}
