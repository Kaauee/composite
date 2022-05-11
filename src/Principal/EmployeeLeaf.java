/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author alunopb
 */
public class EmployeeLeaf implements EmployeeComponent {

    private String nome;
    private String depto;

    public EmployeeLeaf(String nome, String depto) {
        this.nome = nome;
        this.depto = depto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    @Override
    public void showDetails() {
        System.out.println("Nome: " + getNome() + " /Depto:" + getDepto());
    }

    @Override
    public int getSubordinateCount() {
        return 1;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

}
