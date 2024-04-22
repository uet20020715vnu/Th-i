package otherpackage;

public abstract class abstractAnimal implements Animal {
        protected String name;

        public abstractAnimal(String name) {
            this.name = name;
        }

        public abstract void move();
    }

