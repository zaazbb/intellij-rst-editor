package com.github.zaazbb.intellijrsteditor.services

import com.github.zaazbb.intellijrsteditor.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
