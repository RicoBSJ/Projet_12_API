package com.aubrun.eric.projet12.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@SequenceGenerator(name = "nomenclature_user_id_generator", sequenceName = "nomenclature_user_id_seq", allocationSize = 1)
@Table(name = "NOMENCLATURE_USER")
public class NomenclatureUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "nomenclature_user_id_generator")
    @Column(name = "id_nomenclature_user")
    private Integer nomenclatureUserId;
    @Column(name = "first_name_nomenclature_user")
    private String nomenclatureUserFirstName;
    @Column(name = "last_name_nomenclature_user")
    private String nomenclatureUserLastName;
    @Column(name = "password_nomenclature_user")
    private String password;
    @Column(name = "email_nomenclature_user")
    private String email;
    @Column(name = "date_seniority")
    private Date seniority;
    private List<Custom> customList;
    private Set<Role> roles;
    private Set<Service> services;

    public NomenclatureUser(Integer nomenclatureUserId, String nomenclatureUserFirstName, String nomenclatureUserLastName, String password, String email, Date seniority, List<Custom> customList, Set<Role> roles, Set<Service> services) {
        this.nomenclatureUserId = nomenclatureUserId;
        this.nomenclatureUserFirstName = nomenclatureUserFirstName;
        this.nomenclatureUserLastName = nomenclatureUserLastName;
        this.password = password;
        this.email = email;
        this.seniority = seniority;
        this.customList = customList;
        this.roles = roles;
        this.services = services;
    }

    public NomenclatureUser() {

    }

    public Integer getNomenclatureUserId() {
        return nomenclatureUserId;
    }

    public void setNomenclatureUserId(Integer nomenclatureUserId) {
        this.nomenclatureUserId = nomenclatureUserId;
    }

    public String getNomenclatureUserFirstName() {
        return nomenclatureUserFirstName;
    }

    public void setNomenclatureUserFirstName(String nomenclatureUserFirstName) {
        this.nomenclatureUserFirstName = nomenclatureUserFirstName;
    }

    public String getNomenclatureUserLastName() {
        return nomenclatureUserLastName;
    }

    public void setNomenclatureUserLastName(String nomenclatureUserLastName) {
        this.nomenclatureUserLastName = nomenclatureUserLastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSeniority() {
        return seniority;
    }

    public void setSeniority(Date seniority) {
        this.seniority = seniority;
    }

    public List<Custom> getCustomList() {
        return customList;
    }

    public void setCustomList(List<Custom> customList) {
        this.customList = customList;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "NomenclatureUser{" +
                "nomenclatureUserId=" + nomenclatureUserId +
                ", nomenclatureUserFirstName='" + nomenclatureUserFirstName + '\'' +
                ", nomenclatureUserLastName='" + nomenclatureUserLastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", seniority=" + seniority +
                ", customList=" + customList +
                ", roles=" + roles +
                ", services=" + services +
                '}';
    }
}
