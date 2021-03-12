package it.iad.crud;

public class Automa implements State {

    private State stato;

    public Automa() {
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo in " + stato);
        System.out.println("Evento: " + e);
        stato.next(e);
        System.out.println("Arrivati in " + stato + "\n");
    }

    private class RicercaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new AggiungiState();
            } else if (e instanceof RicercaEvent) {
                System.out.println("Sono in RicercaEvent");
            } else {
                System.out.println("Evento inatteso!");
            }
        }
    }

    private class VisualizzaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AddEvent) {
                stato = new AggiungiState();
            } else if (e instanceof SelezionaEvent) {
                System.out.println("Sono in SelezionaEvent");
            } else if (e instanceof ModificaEvent) {
                stato = new ModificaState();
            } else if (e instanceof RimuoviEvent) {
                stato = new RimuoviState();
            } else if (e instanceof RicercaEvent) {
                stato = new RicercaState();
            } else {
                System.out.println("Evento inatteso!");
            }
        }

    }

    private class AggiungiState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof ConfermaEvent) {
                if (((ConfermaEvent) e).isValido()) {
                    stato = new VisualizzaState();
                } else {
                    System.out.println("Conferma non valido");
                    //gui.stampaMessaggio("Importo isufficiente: " + tot);
                }
            } else if (e instanceof AnnullaEvent) {
                stato = new RicercaState();
            } else {
                System.out.println("Evento inatteso!");
            }
        }

    }

    private class RimuoviState implements State {

        @Override
        public void next(Event e) {
             if (e instanceof AnnullaEvent) {
                stato = new VisualizzaState();
            } else if (e instanceof ConfermaEvent) {
                stato = new RicercaState();
            } else {
                System.out.println("Evento inatteso!");
            }
        }

    }

    private class ModificaState implements State {

        @Override
        public void next(Event e) {
            if (e instanceof AnnullaEvent) {
                stato = new VisualizzaState();
            } else if (e instanceof ConfermaEvent) {
                stato = new VisualizzaState();
            } else {
                System.out.println("Evento inatteso!");
            }
        }

    }
}
