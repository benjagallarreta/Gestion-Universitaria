public class CargaEstatica {
    public static void main(String[] args) {

        GestionUniversitaria GU = new GestionUniversitaria();

    // CARRERA 1

        Carrera c1 = new Carrera();
            c1.setNombre("Cocina Criolla");
            c1.setCuatrimestresTotales(6);

            Materia m1 = new Materia();
            m1.setCodigo("0001");
            m1.setNombre("introduccion a la torta frita I");
            m1.setCuatrimestre(1);
            m1.setTipo("obligatoria");

            Materia m2 = new Materia();
            m2.setCodigo("0002");
            m2.setNombre("Estructurado y coccion de carnes");
            m2.setCuatrimestre(1);
            m2.setTipo("obligatoria");

            Materia m3 = new Materia();
            m3.setCodigo("0003");
            m3.setNombre("introduccion a la torta frita II");
            m3.setCuatrimestre(2);
            m3.setTipo("obligatoria");

            Materia m4 = new Materia();
            m4.setCodigo("0004");
            m4.setNombre("Preparación de salsas y condimentos");
            m4.setCuatrimestre(2);
            m4.setTipo("obligatoria");

            Materia m5 = new Materia();
            m5.setCodigo("0005");
            m5.setNombre("Pastelería avanzada");
            m5.setCuatrimestre(3);
            m5.setTipo("obligatoria");

            Materia m6 = new Materia();
            m6.setCodigo("0006");
            m6.setNombre("Gastronomía internacional");
            m6.setCuatrimestre(3);
            m6.setTipo("obligatoria");

        GU.agregarMateria(c1, m1);
        GU.agregarMateria(c1, m2);
        GU.agregarMateria(c1, m3);
        GU.agregarMateria(c1, m4);
        GU.agregarMateria(c1, m5);
        GU.agregarMateria(c1, m6);

// ALUMNOS TOTALES

        Alumno a1 = new Alumno();
        a1.setNombre("Lucía");
        a1.setApellido("Gómez");
        a1.setLegajo(120001);
        a1.setDNI(42650001);
        
        Alumno a2 = new Alumno();
        a2.setNombre("Martín");
        a2.setApellido("Fernández");
        a2.setLegajo(120002);
        a2.setDNI(42650002);
        
        Alumno a3 = new Alumno();
        a3.setNombre("Sofía");
        a3.setApellido("Rodríguez");
        a3.setLegajo(120003);
        a3.setDNI(42650003);
        
        Alumno a4 = new Alumno();
        a4.setNombre("Mateo");
        a4.setApellido("Martínez");
        a4.setLegajo(120004);
        a4.setDNI(42650004);
        
        Alumno a5 = new Alumno();
        a5.setNombre("Valentina");
        a5.setApellido("Pérez");
        a5.setLegajo(120005);
        a5.setDNI(42650005);
        
        Alumno a6 = new Alumno();
        a6.setNombre("Benjamín");
        a6.setApellido("López");
        a6.setLegajo(120006);
        a6.setDNI(42650006);
        
        Alumno a7 = new Alumno();
        a7.setNombre("Emilia");
        a7.setApellido("García");
        a7.setLegajo(120007);
        a7.setDNI(42650007);
        
        Alumno a8 = new Alumno();
        a8.setNombre("Máximo");
        a8.setApellido("Sánchez");
        a8.setLegajo(120008);
        a8.setDNI(42650008);
        
        Alumno a9 = new Alumno();
        a9.setNombre("Isabella");
        a9.setApellido("Díaz");
        a9.setLegajo(120009);
        a9.setDNI(42650009);
        
        Alumno a10 = new Alumno();
        a10.setNombre("Thiago");
        a10.setApellido("Martínez");
        a10.setLegajo(120010);
        a10.setDNI(42650010);
        
        Alumno a11 = new Alumno();
        a11.setNombre("Sara");
        a11.setApellido("Gómez");
        a11.setLegajo(120011);
        a11.setDNI(42650011);
        
        Alumno a12 = new Alumno();
        a12.setNombre("Lorenzo");
        a12.setApellido("Fernández");
        a12.setLegajo(120012);
        a12.setDNI(42650012);
        
        Alumno a13 = new Alumno();
        a13.setNombre("Victoria");
        a13.setApellido("Rodríguez");
        a13.setLegajo(120013);
        a13.setDNI(42650013);
        
        Alumno a14 = new Alumno();
        a14.setNombre("Juan");
        a14.setApellido("Martínez");
        a14.setLegajo(120014);
        a14.setDNI(42650014);
        
        Alumno a15 = new Alumno();
        a15.setNombre("Lucas");
        a15.setApellido("Pérez");
        a15.setLegajo(120015);
        a15.setDNI(42650015);
        
        Alumno a16 = new Alumno();
        a16.setNombre("Renata");
        a16.setApellido("López");
        a16.setLegajo(120016);
        a16.setDNI(42650016);
        
        Alumno a17 = new Alumno();
        a17.setNombre("Alejandro");
        a17.setApellido("García");
        a17.setLegajo(120017);
        a17.setDNI(42650017);
        
        Alumno a18 = new Alumno();
        a18.setNombre("María");
        a18.setApellido("Sánchez");
        a18.setLegajo(120018);
        a18.setDNI(42650018);
        
        Alumno a19 = new Alumno();
        a19.setNombre("Emiliano");
        a19.setApellido("Díaz");
        a19.setLegajo(120019);
        a19.setDNI(42650019);
        
        Alumno a20 = new Alumno();
        a20.setNombre("Ana");
        a20.setApellido("Martínez");
        a20.setLegajo(120020);
        a20.setDNI(42650020);
        
        Alumno a21 = new Alumno();
        a21.setNombre("Diego");
        a21.setApellido("Gómez");
        a21.setLegajo(120021);
        a21.setDNI(42650021);
        
        Alumno a22 = new Alumno();
        a22.setNombre("Florencia");
        a22.setApellido("Fernández");
        a22.setLegajo(120022);
        a22.setDNI(42650022);
        
        Alumno a23 = new Alumno();
        a23.setNombre("Pedro");
        a23.setApellido("Rodríguez");
        a23.setLegajo(120023);
        a23.setDNI(42650023);
        
        Alumno a24 = new Alumno();
        a24.setNombre("Camila");
        a24.setApellido("Martínez");
        a24.setLegajo(120024);
        a24.setDNI(42650024);
        
        Alumno a25 = new Alumno();
        a25.setNombre("Luciano");
        a25.setApellido("Pérez");
        a25.setLegajo(120025);
        a25.setDNI(42650025);
        
        Alumno a26 = new Alumno();
        a26.setNombre("Valentín");
        a26.setApellido("López");
        a26.setLegajo(120026);
        a26.setDNI(42650026);
        
        Alumno a27 = new Alumno();
        a27.setNombre("Agustina");
        a27.setApellido("García");
        a27.setLegajo(120027);
        a27.setDNI(42650027);
        
        Alumno a28 = new Alumno();
        a28.setNombre("Tobías");
        a28.setApellido("Sánchez");
        a28.setLegajo(120028);
        a28.setDNI(42650028);
        
        Alumno a29 = new Alumno();
        a29.setNombre("Carolina");
        a29.setApellido("Díaz");
        a29.setLegajo(120029);
        a29.setDNI(42650029);
        
        Alumno a30 = new Alumno();
        a30.setNombre("Matías");
        a30.setApellido("Martínez");
        a30.setLegajo(120030);
        a30.setDNI(42650030);
        
        Alumno a31 = new Alumno();
        a31.setNombre("Abril");
        a31.setApellido("Gómez");
        a31.setLegajo(120031);
        a31.setDNI(42650031);
        
        Alumno a32 = new Alumno();
        a32.setNombre("Facundo");
        a32.setApellido("Fernández");
        a32.setLegajo(120032);
        a32.setDNI(42650032);
        
        Alumno a33 = new Alumno();
        a33.setNombre("Mariana");
        a33.setApellido("Rodríguez");
        a33.setLegajo(120033);
        a33.setDNI(42650033);
        
        Alumno a34 = new Alumno();
        a34.setNombre("Luciana");
        a34.setApellido("Martínez");
        a34.setLegajo(120034);
        a34.setDNI(42650034);
        
        Alumno a35 = new Alumno();
        a35.setNombre("Ramiro");
        a35.setApellido("Pérez");
        a35.setLegajo(120035);
        a35.setDNI(42650035);
        
        Alumno a36 = new Alumno();
        a36.setNombre("Catalina");
        a36.setApellido("López");
        a36.setLegajo(120036);
        a36.setDNI(42650036);
        
        Alumno a37 = new Alumno();
        a37.setNombre("Ignacio");
        a37.setApellido("García");
        a37.setLegajo(120037);
        a37.setDNI(42650037);
        
        Alumno a38 = new Alumno();
        a38.setNombre("Julieta");
        a38.setApellido("Sánchez");
        a38.setLegajo(120038);
        a38.setDNI(42650038);
        
        Alumno a39 = new Alumno();
        a39.setNombre("Lautaro");
        a39.setApellido("Díaz");
        a39.setLegajo(120039);
        a39.setDNI(42650039);
        
        Alumno a40 = new Alumno();
        a40.setNombre("Milagros");
        a40.setApellido("Martínez");
        a40.setLegajo(120040);
        a40.setDNI(42650040);
        
        Alumno a41 = new Alumno();
        a41.setNombre("Juan Pablo");
        a41.setApellido("Gómez");
        a41.setLegajo(120041);
        a41.setDNI(42650041);
        
        Alumno a42 = new Alumno();
        a42.setNombre("Guadalupe");
        a42.setApellido("Fernández");
        a42.setLegajo(120042);
        a42.setDNI(42650042);
        
        Alumno a43 = new Alumno();
        a43.setNombre("Gonzalo");
        a43.setApellido("Rodríguez");
        a43.setLegajo(120043);
        a43.setDNI(42650043);
        
        Alumno a44 = new Alumno();
        a44.setNombre("Martina");
        a44.setApellido("Martínez");
        a44.setLegajo(120044);
        a44.setDNI(42650044);
        
        Alumno a45 = new Alumno();
        a45.setNombre("Leonardo");
        a45.setApellido("Pérez");
        a45.setLegajo(120045);
        a45.setDNI(42650045);
        
        Alumno a46 = new Alumno();
        a46.setNombre("Valeria");
        a46.setApellido("López");
        a46.setLegajo(120046);
        a46.setDNI(42650046);
        
        Alumno a47 = new Alumno();
        a47.setNombre("Renzo");
        a47.setApellido("García");
        a47.setLegajo(120047);
        a47.setDNI(42650047);
        
        Alumno a48 = new Alumno();
        a48.setNombre("Lara");
        a48.setApellido("Sánchez");
        a48.setLegajo(120048);
        a48.setDNI(42650048);
        
        Alumno a49 = new Alumno();
        a49.setNombre("Francisco");
        a49.setApellido("Díaz");
        a49.setLegajo(120049);
        a49.setDNI(42650049);
        
        Alumno a50 = new Alumno();
        a50.setNombre("Agustín");
        a50.setApellido("Martínez");
        a50.setLegajo(120050);
        a50.setDNI(42650050);
        
// VALIDACION DE ALUMNOS

        GU.validarAlumno(a1);
        GU.validarAlumno(a2);
        GU.validarAlumno(a3);
        GU.validarAlumno(a4);
        GU.validarAlumno(a5);
        GU.validarAlumno(a6);
        GU.validarAlumno(a7);
        GU.validarAlumno(a8);
        GU.validarAlumno(a9);
        GU.validarAlumno(a10);
        GU.validarAlumno(a11);
        GU.validarAlumno(a12);
        GU.validarAlumno(a13);
        GU.validarAlumno(a14);
        GU.validarAlumno(a15);
        GU.validarAlumno(a16);
        GU.validarAlumno(a17);
        GU.validarAlumno(a18);
        GU.validarAlumno(a19);
        GU.validarAlumno(a20);
        GU.validarAlumno(a21);
        GU.validarAlumno(a22);
        GU.validarAlumno(a23);
        GU.validarAlumno(a24);
        GU.validarAlumno(a25);
        GU.validarAlumno(a26);
        GU.validarAlumno(a27);
        GU.validarAlumno(a28);
        GU.validarAlumno(a29);
        GU.validarAlumno(a30);
        GU.validarAlumno(a31);
        GU.validarAlumno(a32);
        GU.validarAlumno(a33);
        GU.validarAlumno(a34);
        GU.validarAlumno(a35);
        GU.validarAlumno(a36);
        GU.validarAlumno(a37);
        GU.validarAlumno(a38);
        GU.validarAlumno(a39);
        GU.validarAlumno(a40);
        GU.validarAlumno(a41);
        GU.validarAlumno(a42);
        GU.validarAlumno(a43);
        GU.validarAlumno(a44);
        GU.validarAlumno(a45);
        GU.validarAlumno(a46);
        GU.validarAlumno(a47);
        GU.validarAlumno(a48);
        GU.validarAlumno(a49);
        GU.validarAlumno(a50);        

    }
}