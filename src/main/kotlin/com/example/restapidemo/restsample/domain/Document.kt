package com.example.restapidemo.restsample.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Document (
        @Id @GeneratedValue
        val id:Long,
        val text:String
        )



