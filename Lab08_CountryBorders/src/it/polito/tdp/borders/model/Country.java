package it.polito.tdp.borders.model;

public class Country {
int numero;
String abbreviazione;
String nomeCompleto;
public Country( int numero){
	this.numero=numero;
}
public Country(int int1, String string, String string2) {
	this.numero=int1;
	this.abbreviazione=string;
	this.nomeCompleto=string2;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getAbbreviazione() {
	return abbreviazione;
}
public void setAbbreviazione(String abbreviazione) {
	this.abbreviazione = abbreviazione;
}
public String getNomeCompleto() {
	return nomeCompleto;
}
public void setNomeCompleto(String nomeCompleto) {
	this.nomeCompleto = nomeCompleto;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((abbreviazione == null) ? 0 : abbreviazione.hashCode());
	result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
	result = prime * result + numero;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Country other = (Country) obj;
	if (abbreviazione == null) {
		if (other.abbreviazione != null)
			return false;
	} else if (!abbreviazione.equals(other.abbreviazione))
		return false;
	if (nomeCompleto == null) {
		if (other.nomeCompleto != null)
			return false;
	} else if (!nomeCompleto.equals(other.nomeCompleto))
		return false;
	if (numero != other.numero)
		return false;
	return true;
}

}
