import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        MainMenu();
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> obsessedWithYou();
            case 2 -> westConnect();
            case 3 -> beautifulGirl();
            case 4 -> shitChanged();
            case 5 -> emotions();
            case 6 -> nerdesin();
            case 7 -> bamba();
            default -> System.out.println("You entered wrong");
        }
    }

    public static void obsessedWithYou() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file1 = new File("central-cee-obsessed-with-you-official-video.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
        Clip clip1 = AudioSystem.getClip();
        clip1.open(audioStream);

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P") -> clip1.start();
                case ("S") -> clip1.stop();
                case ("R") -> clip1.setMicrosecondPosition(0);
                case ("Q") -> clip1.close();
                default -> System.out.println("You entered wrong");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice1;

            MainMenu();
            choice1 = scanner.nextInt();
            if (choice1==1){
                obsessedWithYou();
            } else if (choice1==2) {
                westConnect();
            } else if (choice1==3) {
                beautifulGirl();
            } else if (choice1==4) {
                shitChanged();
            } else if (choice1==5) {
                emotions();
            } else if (choice1==6) {
                nerdesin();
            } else if (choice1==7) {
            bamba();
        }else
            System.out.println("You entered wrong");

        }
    }
    public static void westConnect() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file2 = new File("luciano-ft-central-cee-west-connect-music-video.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file2);
        Clip clip2 = AudioSystem.getClip();
        clip2.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P") -> clip2.start();
                case ("S") -> clip2.stop();
                case ("R") -> clip2.setMicrosecondPosition(0);
                case ("Q") -> clip2.close();
                default -> System.out.println("You entered wrong..");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1)
                obsessedWithYou();
            else if (choice==2) {
                westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            } else if (choice==7) {
            bamba();
        }else
            System.out.println("You entered wrong");
        }
    }

    public static void beautifulGirl() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file3 = new File("luciano-beautiful-girl.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file3);
        Clip clip3 = AudioSystem.getClip();
        clip3.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response) {
                case ("P") -> clip3.start();
                case ("S") -> clip3.stop();
                case ("R") -> clip3.setMicrosecondPosition(0);
                case ("Q") -> clip3.close();
                default -> System.out.println("You entered wrong..");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1)
                obsessedWithYou();
            else if (choice==2) {
                westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            } else if (choice==7) {
            bamba();
        }else
            System.out.println("You entered wrong");
        }

    }
    public static void shitChanged() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file4 = new File("ufo361-shit-changed.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file4);
        Clip clip4 = AudioSystem.getClip();
        clip4.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip4.start();break;
                case ("S"): clip4.stop();break;
                case ("R"): clip4.setMicrosecondPosition(0);break;
                case ("Q"): clip4.close();break;
                default:
                    System.out.println("You entered wrong");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1) {
                obsessedWithYou();
            }
            else if (choice==2) {
             westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            }else if (choice==7) {
            bamba();
        }else
            System.out.println("You entered wrong");
        }
    }
    public static void emotions() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file5 = new File("emotions-20.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file5);
        Clip clip5 = AudioSystem.getClip();
        clip5.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip5.start();break;
                case ("S"): clip5.stop();break;
                case ("R"): clip5.setMicrosecondPosition(0);break;
                case ("Q"): clip5.close();break;
                default:
                    System.out.println("You entered wrong");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1) {
                obsessedWithYou();
            }
            else if (choice==2) {
                westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            } else if (choice==7) {
            bamba();
        }else
            System.out.println("You entered wrong");
        }
    }
    public static void nerdesin() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file6 = new File("ezhel-nerdesin-official-audio.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file6);
        Clip clip6 = AudioSystem.getClip();
        clip6.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip6.start();break;
                case ("S"): clip6.stop();break;
                case ("R"): clip6.setMicrosecondPosition(0);break;
                case ("Q"): clip6.close();break;
                default:
                    System.out.println("You entered wrong");

            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1) {
                obsessedWithYou();
            }
            else if (choice==2) {
                westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            } else if (choice==7) {
                bamba();
            }else
                System.out.println("You entered wrong");
        }
    }
    public static void bamba() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file7 = new File("luciano-ft-bia-aitch-bamba.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file7);
        Clip clip7 = AudioSystem.getClip();
        clip7.open(audioStream);

        String response = "";
        while (!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Restart, Q = Quit");
            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case ("P"): clip7.start();break;
                case ("S"): clip7.stop();break;
                case ("R"): clip7.setMicrosecondPosition(0);break;
                case ("Q"): clip7.close();break;
                default:
                    System.out.println("You entered wrong");
            }
        }
        System.out.println("Dou you want to listen to another song? Y/N: ");
        response = scanner.next();
        while (!response.equals("N")){
            int choice;
            MainMenu();
            choice = scanner.nextInt();
            if (choice==1) {
                obsessedWithYou();
            }
            else if (choice==2) {
                westConnect();
            } else if (choice==3) {
                beautifulGirl();
            } else if (choice==4) {
                shitChanged();
            } else if (choice==5) {
                emotions();
            } else if (choice==6) {
                nerdesin();
            } else if (choice==7) {
                bamba();
            }else
                System.out.println("You entered wrong");
        }
    }

    public static void MainMenu(){

        System.out.println("Welcome to radio program");
        System.out.println("-----------------------------------------------");
        System.out.println("1-Central Cee - Obsessed With You");
        System.out.println("2-Luciano ft. Central Cee - West Connect");
        System.out.println("3-Luciano - Beautiful Girl");
        System.out.println("4-UFO361 - Shit Changed");
        System.out.println("5-UFO361 - Emotions 2.0");
        System.out.println("6-Ezhel - Nerdesin");
        System.out.println("7-Luciano ft. Bia & Aitch - BAMBA");
        System.out.println("-----------------------------------------------");
        System.out.println("Please choose which song you want to listen to:  ");

    }
}