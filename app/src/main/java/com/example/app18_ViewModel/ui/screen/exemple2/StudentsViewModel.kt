package com.example.app18_ViewModel.ui.screen.exemple2

import androidx.lifecycle.ViewModel
import com.example.app18_ViewModel.data.exemple2.Student
import com.example.app18_ViewModel.domain.exemple2.StudentProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class StudentsViewModel : ViewModel() {
    private val provider = StudentProvider()
    private var studentIndex = -1
    private var actualStudent: Student? = null

    private val _studentName = MutableStateFlow<String>("")
    val studentName: StateFlow<String> = _studentName
    private val _studentCourse = MutableStateFlow<String>("")
    val studentCourse: StateFlow<String> = _studentCourse
    private val _studentGrade = MutableStateFlow<String>("")
    val studentGrade: StateFlow<String> = _studentGrade

    init {
        getNextStudent()
    }

    fun getNextStudent() {
        studentIndex = (studentIndex + 1) % provider.getStudentsCount()
        actualStudent = provider.getStudentByPosition(studentIndex)
        _studentName.value = actualStudent!!.name
        _studentCourse.value = actualStudent!!.course
        _studentGrade.value = actualStudent!!.grade
    }

    fun editStudentName(newName: String) {
        _studentName.value = newName
    }
    fun editStudentCourse(newCourse: String) {
        _studentCourse.value = newCourse
    }
    fun editStudentGrade(newGrade: String) {
        _studentGrade.value = newGrade
    }
    fun updateStudent(name: String, course: String, grade: String) {
        provider.updateStudent(studentIndex, Student(name, course, grade))
    }

}
