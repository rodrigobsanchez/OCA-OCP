package OCA.Chapter1;

//import java.util.*;
//import java.sql.*;
/*import java.util.Date;  ---> ASSIM compila!!
import java.sql.*;*/

/*import java.util.Date; DOES NOT COMPILE Java doesn't know which class to work with.
import java.sql.Date;*/

import java.util.Date;

public class NamingConflicts {
    /**
     * Ambas wildcards dos packages util e sql possuem a class Date. è necessario
     * estipular qual classe date funciona
     */
    //Date date; //--> exemplo de naming conflitc.
}


 class Conflicts {
    Date date;
    java.sql.Date sqlDate;
}
/**
 * PRESTAR ATENCAO NO NUMERO DA LINHA EM QUE COMECA A CLASSE!!! se comecar
 * na linha 1 e nao for imports nao compila a classe;
 */