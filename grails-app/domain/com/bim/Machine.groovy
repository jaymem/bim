package com.bim

class Machine {
    String serviceTag
    String makeModel
    String lab
    Date dateAdded

    static hasMany = [softwares:Software]

    static constraints = {
        serviceTag(blank: false)
        makeModel(blank: false)
        lab(blank: false)
        dateAdded(nullable: false)
    }
}
