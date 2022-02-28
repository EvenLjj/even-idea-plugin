package com.github.evenljj.evenideaplugin.services

import com.intellij.openapi.project.Project
import com.github.evenljj.evenideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
