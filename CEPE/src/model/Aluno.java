
package model;

public class Aluno extends Usuario{
    private String ra;
    private int classe;
    private int idAluno;
    
    public Aluno()
    {
        
    }
    
    public Aluno(Usuario usuario)
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
    
    

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
     public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
    
}
