# Centro Medico
```
 ,-----.                ,--.                 ,--.   ,--.         ,--.,--.              
'  .--./,---. ,--,--, ,-'  '-.,--.--. ,---.  |   `.'   |,---.  ,-|  |`--' ,---. ,---.  
|  |   | .-. :|      \'-.  .-'|  .--'| .-. | |  |'.'|  | .-. :' .-. |,--.| .--'| .-. | 
'  '--'\   --.|  ||  |  |  |  |  |   ' '-' ' |  |   |  \   --.\ `-' ||  |\ `--.' '-' ' 
 `-----'`----'`--''--'  `--'  `--'    `---'  `--'   `--'`----' `---' `--' `---' `---'  
``` 

<div align="justify">
 
## Índice
- [Proyecto demostracio](/demo/)
  - [Detalles del proyecto](#index01)
  - [Modelo de datos utilizado ](#index02)
  - [Funcionalidades implementadas](#index03)
- [Cobertura de código](/cobertura/)
     

## Detalles del proyecto <a name="index01"></a>
Miniproyecto: CRUD con Mongodb y Maven. Hecho por Daniel Alejandro Rodríguez Herrera y Samuel Hernández Barroso

Las tecnologías que hemos utilizado han sido la siguientes:

- [IntelliJ IDEA - Community Edition](https://www.jetbrains.com/es-es/idea/) IDE en Java
- [GitHub](https://github.com/)como gestor del proyecto.

## Modelo de datos utilizado <a name="index02"></a>

Dispone de tres entidades: Cita, Medico y Paciente, yus respectivos DTO.

C:.
├───.idea
├───.mvn
│   └───wrapper
├───src
│   ├───main
│   │   ├───java
│   │   │   └───es
│   │   │       └───ies
│   │   │           └───puerto
│   │   │               ├───config
│   │   │               ├───controller
│   │   │               │   └───interfaces
│   │   │               ├───demo
│   │   │               ├───exception
│   │   │               ├───mapper
│   │   │               ├───modelo
│   │   │               │   └───entities
│   │   │               ├───negocio
│   │   │               │   └───dto
│   │   │               ├───repositories
│   │   │               └───service
│   │   │                   └───interfaces
│   │   └───resources
│   └───test
│       └───java
│           └───es
│               └───ies
│                   └───puerto
│                       ├───controller
│                       ├───mapper
│                       └───service
└───target
    ├───classes
    │   └───es
    │       └───ies
    │           └───puerto
    │               ├───config
    │               ├───controller
    │               │   └───interfaces
    │               ├───demo
    │               ├───exception
    │               ├───mapper
    │               ├───modelo
    │               │   └───entities
    │               ├───negocio
    │               │   └───dto
    │               ├───repositories
    │               └───service
    │                   └───interfaces
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    ├───maven-status
    │   └───maven-compiler-plugin
    │       ├───compile
    │       │   └───default-compile
    │       └───testCompile
    │           └───default-testCompile
    ├───site
    │   └───jacoco
    │       ├───es.ies.puerto
    │       ├───es.ies.puerto.config
    │       ├───es.ies.puerto.controller
    │       ├───es.ies.puerto.demo
    │       ├───es.ies.puerto.exception
    │       ├───es.ies.puerto.mapper
    │       ├───es.ies.puerto.modelo.entities
    │       ├───es.ies.puerto.negocio.dto
    │       ├───es.ies.puerto.service
    │       └───jacoco-resources
    ├───surefire-reports
    └───test-classes
        └───es
            └───ies
                └───puerto
                    ├───controller
                    ├───mapper
                    └───service

## Funcionalidades implementadas <a name="index03"></a>
La aplicación incluye las funcionalidades de un CRUD respectivamente para cada una de las entidades:

- **getAllObjects:**
  - Cita, Medico y Paciente. 
- **saveObject:**
  - Cita, Medico y Paciente.
- **updateObject:**
  - Cita, Medico y Paciente.
- **deleteObject:**
  - Cita, Medico y Paciente.

</div>
