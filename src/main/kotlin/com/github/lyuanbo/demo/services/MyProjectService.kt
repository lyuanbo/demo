package com.github.lyuanbo.demo.services

import com.intellij.openapi.project.Project
import com.github.lyuanbo.demo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
