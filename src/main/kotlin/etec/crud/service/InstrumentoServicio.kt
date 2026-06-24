package etec.crud.service

import etec.crud.model.Instrumento

class InstrumentoServicio {

    val instrumentos = mutableListOf<Instrumento>()

    fun guardar(instrumento: Instrumento): Instrumento{
        instrumentos.add(instrumento)
        return instrumento
    }

    fun listarTodos(instrumento: Instrumento): List<Instrumento> {
     return instrumentos.toList()
    }

    fun buscarPorId(id: Int): Instrumento?{
        return instrumentos.find { it.id == id }
    }

    fun actualizar(id: Int, instrumento: Instrumento): Instrumento?{
        //Terminar
        return Instrumento
    }

    fun eliminar(id: Int): Boolean {
        return instrumentos.removeIf { it.id == id }
    }

}
