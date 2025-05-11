package javarush_Vad.temp.t02;

import java.util.Scanner;

public class HumanIndexFat {
        private double weightHuman;
        private double heightHuman;
        private double indexManBody;
        private String result = "";

        public HumanIndexFat(double weightHuman, double heightHuman) {
            setWeightHuman(weightHuman);
            setHeightHuman(heightHuman);
            increaseIndexManBody();
            increaseResult();
        }

        public double getWeightHuman() {
            return weightHuman;
        }

        private void setWeightHuman(double weightHuman) {
            if (weightHuman > 0) {
                this.weightHuman = weightHuman;
            } else {
                System.out.println("Вы ввели недопустимое число, введите реальный вес");
                Scanner sc = new Scanner(System.in);
                double trueWeightHuman = sc.nextDouble();
                setWeightHuman(trueWeightHuman);
            }
        }

        public double getHeightHuman() {
            return heightHuman;
        }

        private void setHeightHuman(double heightHuman) {
            if (heightHuman > 0) {
                this.heightHuman = heightHuman;
            } else {
                System.out.println("Вы ввели недопустимое число, введите реальный рост");
                Scanner sc = new Scanner(System.in);
                double trueHeightHuman = sc.nextDouble();
                setHeightHuman(trueHeightHuman);
            }
        }

        private void increaseIndexManBody() {
            indexManBody = weightHuman / (heightHuman * heightHuman);
        }

        private double getIndexManBody() {
            return indexManBody;
        }

        private void increaseResult() {
            if (indexManBody >= 18.5 && indexManBody < 25) {
                result = "Норма, ты в форме!";
            } else if (indexManBody >= 25 && indexManBody < 30) {
                result = "Предожирение. Эй, поосторожнее с пирожными!";
            } else if (indexManBody >= 30) {
                result = "Ожирение. SCHWEINE! Хватит жрать, иди на треню!";
            } else if (indexManBody < 18.5) {
                result = "Дефицит массы тела. В модели решил переквалифицироваться?";
            }
        }

        @Override
        public String toString() {
            return result = "Вес человека= " + weightHuman +
                    ", Рост человека= " + heightHuman +
                    ", Индекс жирности=" + indexManBody +
                    "\n" + result;
        }
    }
