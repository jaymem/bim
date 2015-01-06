package com.bim

class Software {
    String title
    String version
    Date dateAdded
    Machine machine

    static constraints = {
        title(blank: false)
        version(blank: false)
        dateAdded(nullable: false)
    }
}
