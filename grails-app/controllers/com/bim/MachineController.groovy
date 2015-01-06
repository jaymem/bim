package com.bim

class MachineController {

    def scaffold = Machine

    def index() {
        def machine = Machine.list([sort: "serviceTag", order: "asc"])

        return [machine: machine]
    }
}
