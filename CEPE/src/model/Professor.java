package model;

public class Professor extends Usuario{
    private int materia,funcao,idProfessor;
    
    public Professor(Usuario usuario)
    {
        this.setId(usuario.getId());  
        this.setNome(usuario.getNome());    
        this.setSobrenome(usuario.getSobrenome());
        this.setCPF(usuario.getCPF());
        this.setRG(usuario.getRG());
        this.setTelefone(usuario.getTelefone());
        this.setCidade(usuario.getCidade());
        this.setEstado(usuario.getEstado());
        this.setNum(usuario.getNum());
        this.setBairro(usuario.getBairro());
        this.setRua(usuario.getRua());
        this.setEmail(usuario.getEmail());
        this.setSenha(usuario.getSenha());
        this.setDataNasc(usuario.getDataNasc());
        this.setGenero(usuario.getGenero());
        this.setCategoria(usuario.getCategoria());
    }

    public Professor() {
        
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    
    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
    
}
