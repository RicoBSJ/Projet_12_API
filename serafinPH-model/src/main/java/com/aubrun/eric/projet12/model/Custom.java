package com.aubrun.eric.projet12.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@SequenceGenerator(name="custom_id_generator", sequenceName = "custom_id_seq", allocationSize=1)
@Table(name = "CUSTOM")
public class Custom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "custom_id_generator")
    @Column(name = "id_custom")
    private Integer customId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nomenclature_user")
    private NomenclatureUser nomenclatureUser;
    @Column(name = "custom_first_name")
    private String customFirstName;
    @Column(name = "custom_last_name_")
    private String customLastName;
    @Column(name = "date_birth")
    private Date dateBirth;
    @Column(name = "entry_date")
    private Date entryDate;
    @Column(name = "age_custom")
    private Integer age;
    private Set<JuridicProtection> juridicProtectionsCustom;
    private Set<Service> servicesCustom;
    @OneToMany
    @JoinColumn(name = "needs_list")
    private List<Needs> needsList;
    @OneToMany
    @JoinColumn(name = "direct_benefits_list")
    private List<DirectBenefits> directBenefitsList;
    @OneToMany
    @JoinColumn(name = "indirect_benefits_list")
    private List<IndirectBenefits> indirectBenefitsList;

    public Custom(Integer customId, NomenclatureUser nomenclatureUser, String customFirstName, String customLastName, Date dateBirth, Date entryDate, Integer age, Set<JuridicProtection> juridicProtectionsCustom, Set<Service> servicesCustom, List<Needs> needsList, List<DirectBenefits> directBenefitsList, List<IndirectBenefits> indirectBenefitsList) {
        this.customId = customId;
        this.nomenclatureUser = nomenclatureUser;
        this.customFirstName = customFirstName;
        this.customLastName = customLastName;
        this.dateBirth = dateBirth;
        this.entryDate = entryDate;
        this.age = age;
        this.juridicProtectionsCustom = juridicProtectionsCustom;
        this.servicesCustom = servicesCustom;
        this.needsList = needsList;
        this.directBenefitsList = directBenefitsList;
        this.indirectBenefitsList = indirectBenefitsList;
    }

    public Custom() {

    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public NomenclatureUser getNomenclatureUser() {
        return nomenclatureUser;
    }

    public void setNomenclatureUser(NomenclatureUser nomenclatureUser) {
        this.nomenclatureUser = nomenclatureUser;
    }

    public String getCustomFirstName() {
        return customFirstName;
    }

    public void setCustomFirstName(String customFirstName) {
        this.customFirstName = customFirstName;
    }

    public String getCustomLastName() {
        return customLastName;
    }

    public void setCustomLastName(String customLastName) {
        this.customLastName = customLastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<JuridicProtection> getJuridicProtectionsCustom() {
        return juridicProtectionsCustom;
    }

    public void setJuridicProtectionsCustom(Set<JuridicProtection> juridicProtectionsCustom) {
        this.juridicProtectionsCustom = juridicProtectionsCustom;
    }

    public Set<Service> getServicesCustom() {
        return servicesCustom;
    }

    public void setServicesCustom(Set<Service> servicesCustom) {
        this.servicesCustom = servicesCustom;
    }

    public List<Needs> getNeedsList() {
        return needsList;
    }

    public void setNeedsList(List<Needs> needsList) {
        this.needsList = needsList;
    }

    public List<DirectBenefits> getDirectBenefitsList() {
        return directBenefitsList;
    }

    public void setDirectBenefitsList(List<DirectBenefits> directBenefitsList) {
        this.directBenefitsList = directBenefitsList;
    }

    public List<IndirectBenefits> getIndirectBenefitsList() {
        return indirectBenefitsList;
    }

    public void setIndirectBenefitsList(List<IndirectBenefits> indirectBenefitsList) {
        this.indirectBenefitsList = indirectBenefitsList;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "customId=" + customId +
                ", nomenclatureUser=" + nomenclatureUser +
                ", customFirstName='" + customFirstName + '\'' +
                ", customLastName='" + customLastName + '\'' +
                ", dateBirth=" + dateBirth +
                ", entryDate=" + entryDate +
                ", age=" + age +
                ", juridicProtectionsCustom=" + juridicProtectionsCustom +
                ", servicesCustom=" + servicesCustom +
                ", needsList=" + needsList +
                ", directBenefitsList=" + directBenefitsList +
                ", indirectBenefitsList=" + indirectBenefitsList +
                '}';
    }
}
