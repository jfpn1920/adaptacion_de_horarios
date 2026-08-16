import java.util.Scanner;
public class adaptacion_de_horarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] actividades = new String[10];
        String[] responsables = new String[10];
        String[] dias = new String[10];
        String[] horasInicio = new String[10];
        String[] horasFinalizacion = new String[10];
        String[] lugares = new String[10];
        String[] tipos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_adaptacion_de_horarios|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal adaptacion de horarios");
            System.out.println("1) Registrar horario");
            System.out.println("2) Editar horario");
            System.out.println("3) Listar horarios");
            System.out.println("4) Buscar horario");
            System.out.println("5) Eliminar horario");
            System.out.println("6) Adaptar horario");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_horario|--//
                //-----------------------//
                case 1:
                    if (total >= actividades.length) {
                        System.out.println("No hay espacio para registrar mas horarios.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro del horario");
                    System.out.println("id del horario a registrar: " + id);
                    System.out.print("nombre de la actividad: ");
                    actividades[total] = entrada.nextLine();
                    System.out.print("responsable: ");
                    responsables[total] = entrada.nextLine();
                    System.out.print("dia: ");
                    dias[total] = entrada.nextLine();
                    System.out.print("hora de inicio: ");
                    horasInicio[total] = entrada.nextLine();
                    System.out.print("hora de finalizacion: ");
                    horasFinalizacion[total] = entrada.nextLine();
                    System.out.print("lugar: ");
                    lugares[total] = entrada.nextLine();
                    System.out.print("tipo de actividad: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("estado del horario: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Horario registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_horario|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen horarios registrados.");
                        break;
                    }
                    System.out.println("Datos de los horarios");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Responsable: " + responsables[i] + " | Dia: " + dias[i] + " | Inicio: " + horasInicio[i] + " | Finalizacion: " + horasFinalizacion[i] + " | Lugar: " + lugares[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del horario: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del horario");
                        System.out.print("Nueva actividad: ");
                        actividades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo responsable: ");
                        responsables[posicion] = entrada.nextLine();
                        System.out.print("Nuevo dia: ");
                        dias[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de inicio: ");
                        horasInicio[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de finalizacion: ");
                        horasFinalizacion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo lugar: ");
                        lugares[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de actividad: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del horario: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Horario actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_horarios|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen horarios registrados.");
                    } else {
                        System.out.println("Lista de horarios");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Responsable: " + responsables[i] + " | Dia: " + dias[i] + " | Inicio: " + horasInicio[i] + " | Finalizacion: " + horasFinalizacion[i] + " | Lugar: " + lugares[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_horario|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen horarios registrados.");
                        break;
                    }
                    System.out.println("busqueda de horario");
                    System.out.print("ingresa la id para buscar horario: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del horario encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Actividad: " + actividades[posicion] + " | Responsable: " + responsables[posicion] + " | Dia: " + dias[posicion] + " | Inicio: " + horasInicio[posicion] + " | Finalizacion: " + horasFinalizacion[posicion] + " | Lugar: " + lugares[posicion] + " | Tipo: " + tipos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_horario|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen horarios registrados.");
                        break;
                    }
                    System.out.println("Datos de los horarios");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Responsable: " + responsables[i] + " | Dia: " + dias[i] + " | Inicio: " + horasInicio[i] + " | Finalizacion: " + horasFinalizacion[i] + " | Lugar: " + lugares[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del horario a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            actividades[i] = actividades[i + 1];
                            responsables[i] = responsables[i + 1];
                            dias[i] = dias[i + 1];
                            horasInicio[i] = horasInicio[i + 1];
                            horasFinalizacion[i] = horasFinalizacion[i + 1];
                            lugares[i] = lugares[i + 1];
                            tipos[i] = tipos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Horario eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|adaptar_horario|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen horarios registrados.");
                        break;
                    }
                    System.out.println("Datos de los horarios");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Actividad: " + actividades[i] + " | Responsable: " + responsables[i] + " | Dia: " + dias[i] + " | Inicio: " + horasInicio[i] + " | Finalizacion: " + horasFinalizacion[i] + " | Lugar: " + lugares[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del horario a adaptar: ");
                    int idAdaptar = entrada.nextInt();
                    entrada.nextLine();
                    if (idAdaptar >= 1 && idAdaptar <= total) {
                        int posicion = idAdaptar - 1;
                        System.out.println("adaptacion del horario");
                        System.out.print("Nuevo dia: ");
                        dias[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de inicio: ");
                        horasInicio[posicion] = entrada.nextLine();
                        System.out.print("Nueva hora de finalizacion: ");
                        horasFinalizacion[posicion] = entrada.nextLine();
                        System.out.print("Nuevo lugar: ");
                        lugares[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Horario adaptado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Adaptacion de Horarios.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}