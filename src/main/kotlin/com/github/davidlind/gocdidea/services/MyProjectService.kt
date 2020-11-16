package com.github.davidlind.gocdidea.services

import com.intellij.openapi.project.Project
import com.github.davidlind.gocdidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
