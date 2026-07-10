public class QuizApplication {
    void start(){

        boolean isRunning = true;
        Dashboard db = new Dashboard();

        while(isRunning){

            db.showDashboard();

            switch(db.dashboardChoice()){
                case 1: System.out.println();
                        QuizManager qm = new QuizManager();
                        qm.startQuiz();
                        break;
                case 2: System.out.println();
                        System.out.println("RUles, Comming Soon!\n");
                        break;
                case 3: System.out.println();
                        System.out.println("Thankyou for Using My Application.\n");
                        isRunning = false;
                        break;
                default:System.out.println();
                        System.out.println("Invalid Choice!\n");

            }
        }
    }
}
