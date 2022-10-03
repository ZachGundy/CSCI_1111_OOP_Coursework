package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMenuCreate extends Application {

    // Declare stage as window
    Stage window;
    // Create layout BorderPane
    BorderPane layout = new BorderPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("MenuBar Interface");

        //Menu: File
        Menu fileMenu =new Menu("_File");

        //File Menu Items

        MenuItem newFile = new MenuItem("_New...");
        newFile.setOnAction(e -> System.out.println("Clicking \"New\" would create a new file"));
        MenuItem openFile = new MenuItem("_Open");
        openFile.setOnAction(e -> System.out.println("Clicking \"Open\" would open a new file"));
        MenuItem saveFile = new MenuItem("_Save");
        saveFile.setOnAction(e -> System.out.println("Clicking \"Save\" would save current file"));
        MenuItem printFile = new MenuItem("_Print...");
        printFile.setOnAction(e -> System.out.println("Clicking \"Print\" would print current file"));
        MenuItem exitFile = new MenuItem("_Exit");
        exitFile.setOnAction(e -> System.out.println("Clicking \"Exit\" would exit program"));
        fileMenu.getItems().addAll(newFile,openFile,new SeparatorMenuItem(), printFile, saveFile, new SeparatorMenuItem(),exitFile);

        // Menu: Edit
        Menu editMenu = new Menu("_Edit");

        // Edit Menu Items
        MenuItem cutFile = new MenuItem("_Cut");
        cutFile.setOnAction(e -> System.out.println("Clicking \"Cut\" would cut a portion of selected text"));
        MenuItem copyFile = new MenuItem("C_opy");
        copyFile.setOnAction(e -> System.out.println("Clicking \"Copy\" would copy selected text"));
        MenuItem pasteFile = new MenuItem("_Paste");
        pasteFile.setOnAction(e -> System.out.println("Clicking \"Paste\" would paste copied text"));
        MenuItem deleteFile = new MenuItem("_Delete");
        deleteFile.setOnAction(e -> System.out.println("Clicking \"Delete\" would delete selected text"));
        MenuItem findFile = new MenuItem("_Find");
        findFile.setOnAction(e -> System.out.println("Clicking \"Find\" would find specific text or file"));
        editMenu.getItems().addAll(cutFile,copyFile,pasteFile,deleteFile,findFile);

        //Menu: View - Check Menu
        Menu viewMenu = new Menu("_View");

        // ViewMenu Menu Items
        CheckMenuItem showLines = new CheckMenuItem("Show Line _Numbers");
        showLines.setOnAction( e ->  {
            if (showLines.isSelected())
                System.out.println("Program will now display line numbers");
            else
                System.out.println("Hiding Line numbers");
        });

        CheckMenuItem showRecent = new CheckMenuItem("Show Recent _Changes History");
        showRecent.setOnAction( e ->  {
            if (showRecent.isSelected())
                System.out.println("Program will now display recent changes made");
            else
                System.out.println("Not displaying changes to program");
        });

        CheckMenuItem showBreadcrumbs = new CheckMenuItem("Show File _Breadcrumbs");
        showBreadcrumbs.setSelected(true);
        showBreadcrumbs.setOnAction( e -> {

            if (showBreadcrumbs.isSelected())
                System.out.println("Program will show project file tree");
            else
                System.out.println("Hiding project file tree");
        });

        CheckMenuItem darkenMode = new CheckMenuItem(" _Darken Background Mode");
        darkenMode.setOnAction( e ->  {
            if (darkenMode.isSelected())
                System.out.println("Shows program with a dark background");
            else
                System.out.println("Showing Generic Lighter Background");
        });

        CheckMenuItem tips = new CheckMenuItem("Provide _Tips Feature");
        tips.setSelected(true);
        tips.setOnAction( e ->  {
            if (tips.isSelected())
                System.out.println("Tips will occur with programming actions");
            else
                System.out.println("Turn off tips feature");
        });

        viewMenu.getItems().addAll(showLines,showBreadcrumbs,showRecent,darkenMode,tips);

        //Menu: Navigate
        Menu navigateMenu = new Menu("_Navigate");

        //Navigate Menu Items
        MenuItem backward = new MenuItem("_Back");
        backward.setOnAction(e -> System.out.println("Clicking \"Back\" would take your program to your previous screen"));
        MenuItem forward = new MenuItem("_Forward");
        forward.setOnAction(e -> System.out.println("Clicking \"Forward\" would bring you program to the next screen forward"));
        MenuItem zoom = new MenuItem("_Zoom");
        zoom.setOnAction(e -> System.out.println("Clicking \"Zoom\" would zoom in 50 percent on selected lines"));
        MenuItem searchAll = new MenuItem("_Search");
        searchAll.setOnAction(e -> System.out.println("Clicking \"Search\" would search everything in program for entered word"));
        editMenu.getItems().add (new SeparatorMenuItem());
        MenuItem jumpToError = new MenuItem("_Jump To Error");
        jumpToError.setOnAction(e -> System.out.println("Clicking \"Jump To Error\" would cause screen to jump to the next error down the program"));
        navigateMenu.getItems().addAll(backward,forward,zoom,searchAll,jumpToError);

        // Menu: Text - Radio Menu
        Menu textMenu= new Menu("Te_xt");

        //Create Toggle Group
        ToggleGroup textToggle = new ToggleGroup();

        // Text Menu Items
        RadioMenuItem verySmall = new RadioMenuItem("_Very Small");
        verySmall.setOnAction(e -> System.out.println("Clicking \"Very Small\" would change your text size to Very Small"));
        RadioMenuItem small = new RadioMenuItem("_Small");
        small.setOnAction(e -> System.out.println("Clicking \"Back\" would would change your text size to Small"));
        RadioMenuItem standard = new RadioMenuItem("S_tandard");
        standard.setOnAction(e -> System.out.println("Clicking \"Back\" would change your text size back to Standard size"));
        standard.setSelected(true);
        RadioMenuItem large = new RadioMenuItem("_Large");
        large.setOnAction(e -> System.out.println("Clicking \"Back\" would change your text size to Large"));
        RadioMenuItem veryLarge = new RadioMenuItem("Very Lar_ge");
        veryLarge.setOnAction(e -> System.out.println("Clicking \"Back\" would change your text size to Very Large"));

        // add all 5 menu items to toggle croup
        verySmall.setToggleGroup(textToggle);
        small.setToggleGroup(textToggle);
        standard.setToggleGroup(textToggle);
        large.setToggleGroup(textToggle);
        veryLarge.setToggleGroup(textToggle);

        textMenu.getItems().addAll(verySmall,small,standard,large,veryLarge);

        // Menu: Refactor
        Menu refactorMenu = new Menu("_Refactor");

        // Refactor Menu Items
        MenuItem rename  = new MenuItem("_Rename File");
        rename.setOnAction(e -> System.out.println("Clicking \"Rename File\" would allow user to rename file"));
        MenuItem inline = new MenuItem("_Inline Property");
        inline.setOnAction(e -> System.out.println("Clicking \"Inline Property\" will cause the selected code to align itself."));
        Menu introduce = new Menu("_Extract/Introduce...");
        introduce.setOnAction(e -> System.out.println("Clicking \"Extract/Introduce\" will allow user to extract or introduce code outside program"));
        MenuItem pull = new MenuItem("Pull MemberS _Up");
        pull.setOnAction(e -> System.out.println("Clicking \"Pull Members Up\" will cause code to shift up creating room"));
        MenuItem push = new MenuItem("Push Members _Down");
        push.setOnAction(e -> System.out.println("Clicking \"Push Members Down\" will cause code to shift down creating room"));

        // SubMenu: Introduce
        //Introduce subMenu Items
        MenuItem variable  = new MenuItem("_Variable...");
        variable.setOnAction(e -> System.out.println("Clicking \"Variable\" would allow user to introduce/extract a Variable"));
        MenuItem superClass = new MenuItem("_SuperClass...");
        superClass.setOnAction(e -> System.out.println("Clicking \"SuperClass\" would allow user to introduce/extract a SuperClass."));
        MenuItem method = new MenuItem("_Method...");
        method.setOnAction(e -> System.out.println("Clicking \"Method\" would allow user to introduce/extract a Method"));
        MenuItem subInterface = new MenuItem("_Interface...");
        subInterface.setOnAction(e -> System.out.println("Clicking \"Interface\" wwould allow user to introduce/extract an Interface"));
        MenuItem parameter = new MenuItem("_Parameter...");
        parameter.setOnAction(e -> System.out.println("Clicking \"Parameter\" would allow user to introduce/extract a Parameter"));

        introduce.getItems().addAll(variable,superClass,method,subInterface,parameter);
        refactorMenu.getItems().addAll(rename,inline,introduce,pull,push);

        // Menu: Run
        Menu runMenu = new Menu("R_un");

        // Run Menu Items Plus Image Icon and Accelerator

        // Declare image
        Image runIcon = new Image("C:\\Users\\zachp\\OneDrive\\Desktop\\Run Program Icon.png");
        // View Image and set Height and Width
        ImageView runView = new ImageView(runIcon);
        runView.setFitWidth(15);
        runView.setFitHeight(15);
        MenuItem runProgram = new MenuItem("_Run...");
        runProgram.setGraphic(runView);
        // Create Quick Key Accelerator combo
        runProgram.setAccelerator(new KeyCodeCombination(KeyCode.F10, KeyCombination.ALT_DOWN, KeyCombination.SHIFT_DOWN));
        runProgram.setOnAction(e -> System.out.println("Clicking \"Run\" would allow user to run current code and display content"));
        MenuItem debug = new MenuItem("_Debug...");
        debug.setOnAction(e -> System.out.println("Clicking \"Debug\" would have program being debuggin process"));
        MenuItem build = new MenuItem("_Build");
        build.setOnAction(e -> System.out.println("Clicking \"Build\" would bring up build path options"));
        MenuItem editConfig = new MenuItem("_Edit Configuration");
        editConfig.setOnAction(e -> System.out.println("Clicking \"Edit Configuration\" Would allow user to bring a menu to change project name, build path, directory etc"));
        MenuItem stop = new MenuItem("_Stop");
        stop.setDisable(true);
        stop.setOnAction(e -> System.out.println("Clicking \"Stop\" would Terminate the program after it runs"));
        runMenu.getItems().addAll(runProgram,debug,build,editConfig,stop);

        // Menu: Tools/VCS
        Menu tvcsMenu = new Menu("_Tools/VCS");

        // Tools/VCS Menu Items
        MenuItem space = new MenuItem("_Space...");
        space.setOnAction(e -> System.out.println("Clicking \"Space\" would allow access their Space Profile to pull code"));
        MenuItem kotlin = new MenuItem("_Kotlin...");
        kotlin.setOnAction(e -> System.out.println("Clicking \"Kotlin\" would allow user to access Kotlin Language "));
        MenuItem gitHub = new MenuItem("_GitHub...");
        gitHub.setOnAction(e -> System.out.println("Clicking \"Github\" Would allow user to open github profile"));
        MenuItem qoDana= new MenuItem("_QoDana...");
        qoDana.setOnAction(e -> System.out.println("Clicking \"QoDana\" would allow user to access a QoDana Analysis Report"));
        MenuItem browse = new MenuItem("_Browse VCS...");
        browse.setOnAction(e -> System.out.println("Clicking \"Browse VCS\" would allow user to browse for their VCS"));
        tvcsMenu.getItems().addAll(space,kotlin,gitHub,qoDana,browse);


        // Menu: Help
        Menu helpMenu = new Menu("_Help");

        // Help Menu Items
        MenuItem feedback = new MenuItem("Submit _Feedback");
        feedback.setOnAction(e -> System.out.println("Clicking \"Submit Feedback\" would allow user to submit feedback"));
        MenuItem start = new MenuItem("_Getting Started");
        start.setOnAction(e -> System.out.println("Clicking \"Getting Started\" would pull up a tutorial for beginners "));
        MenuItem tipOfDay = new MenuItem("_Tip of the Day");
        tipOfDay.setOnAction(e -> System.out.println("Clicking \"Tip of the Day\" Would display a Tip box with a helpful phrase"));
        Menu contactMenu = new Menu("_Contact Support"); //SubMenu: Contact
        contactMenu.setOnAction(e -> System.out.println("Clicking \"Contact Support\" Would open a menu for user to contact customer support"));
        MenuItem about = new MenuItem("_About");
        about.setOnAction(e -> System.out.println("Clicking \"About\" would display text regarding the program"));

        //SubMenu: Contact

        // Contact SubMenu Items
        MenuItem email = new MenuItem("_Email Support");
        space.setOnAction(e -> System.out.println("Clicking \"Email Support\" Would allow user to contact customer support via email"));
        MenuItem phone = new MenuItem("_Call Support");
        kotlin.setOnAction(e -> System.out.println("Clicking \"Call Support\" Would allow user to contact customer support via phone"));
        MenuItem website = new MenuItem("_Visit Support Website");
        gitHub.setOnAction(e -> System.out.println("Clicking \"Visit Support Website\" Would allow user to contact customer support via Website"));
        MenuItem chat = new MenuItem("Chat With _Live Specialist");
        qoDana.setOnAction(e -> System.out.println("Clicking \"Chat with Live Specialist\" Would allow user to contact customer support via Direct Chat"));
        MenuItem fax = new MenuItem("_Fax Support");
        browse.setOnAction(e -> System.out.println("Clicking \"Fax Support\" Would allow user to contact customer support via Fax"));
        contactMenu.getItems().addAll(email,phone,website,chat,fax);
        helpMenu.getItems().addAll(feedback,start,tipOfDay,contactMenu,about);


        //Menu Bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,editMenu,viewMenu,navigateMenu,textMenu,refactorMenu,runMenu,tvcsMenu,helpMenu);

        layout = new BorderPane();
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}