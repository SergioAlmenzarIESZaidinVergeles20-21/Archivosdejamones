package com.ad.almenzarjimenezsergio.archivosdejamones.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Objects;

public class Vino implements Serializable, Parcelable {
    private String nombre, bodega, color, origen;
    private  double graduacion;
    private int fecha;
    private long id;

    public Vino(long id,String nombre, String bodega, String color, String origen, double graduacion, int fecha) {
        this.id = id;
        this.nombre = nombre;
        this.bodega = bodega;
        this.color = color;
        this.origen = origen;
        this.graduacion = graduacion;
        this.fecha = fecha;
    }

    public Vino() {
        this(0,null, null, null, null, 0.0, 0);
    }

    public Vino(String nombre, String bodega, String color, String origen, double graduacion, int fecha) {
        this.nombre = nombre;
        this.bodega = bodega;
        this.color = color;
        this.origen = origen;
        this.graduacion = graduacion;
        this.fecha = fecha;
        this.id = (long)(Math.random() *100);
    }

    protected Vino(Parcel in) {
        nombre = in.readString();
        bodega = in.readString();
        color = in.readString();
        origen = in.readString();
        graduacion = in.readDouble();
        fecha = in.readInt();
        id = in.readLong();
    }

    public static final Creator<Vino> CREATOR = new Creator<Vino>() {
        @Override
        public Vino createFromParcel(Parcel in) {
            return new Vino(in);
        }

        @Override
        public Vino[] newArray(int size) {
            return new Vino[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Vino{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", bodega='" + bodega + '\'' +
                ", color='" + color + '\'' +
                ", origen='" + origen + '\'' +
                ", graduacion=" + graduacion +
                ", fecha=" + fecha +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vino vino = (Vino) o;
        return id == vino.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(bodega);
        parcel.writeString(color);
        parcel.writeString(origen);
        parcel.writeDouble(graduacion);
        parcel.writeInt(fecha);
        parcel.writeLong(id);
    }
}
