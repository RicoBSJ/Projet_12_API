package com.aubrun.eric.projet12.model;

public class JuridicProtection {

    Integer juridicProtectionId;
    EJuridicProtection juridicProtectionName;

    public JuridicProtection(Integer juridicProtectionId, EJuridicProtection juridicProtectionName) {
        this.juridicProtectionId = juridicProtectionId;
        this.juridicProtectionName = juridicProtectionName;
    }

    public Integer getJuridicProtectionId() {
        return juridicProtectionId;
    }

    public void setJuridicProtectionId(Integer juridicProtectionId) {
        this.juridicProtectionId = juridicProtectionId;
    }

    public EJuridicProtection getJuridicProtectionName() {
        return juridicProtectionName;
    }

    public void setJuridicProtectionName(EJuridicProtection juridicProtectionName) {
        this.juridicProtectionName = juridicProtectionName;
    }

    @Override
    public String toString() {
        return "JuridicProtection{" +
                "juridicProtectionId=" + juridicProtectionId +
                ", juridicProtectionName=" + juridicProtectionName +
                '}';
    }
}
