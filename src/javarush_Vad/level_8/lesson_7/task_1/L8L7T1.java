package javarush_Vad.level_8.lesson_7.task_1;

public class L8L7T1 {

    public class Terran {
        class Human extends Terran {
            class Woman extends Human {

            }
        }
    }
}
// РЕШЕНИЕ (SOLUTION)
/*
Woman.java

public class Woman extends Human {
}

Terran.java

public class Terran {
}

Human.java

public class Human extends Terran {
}
 */