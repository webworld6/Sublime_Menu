import java.awt.*;
public class Subline_menu extends Frame
{
	 Subline_menu()
	 {
         MenuBar mb=new MenuBar();
         Menu m1=new Menu("File");
         Menu m2=new Menu("Edit");
         Menu m3=new Menu("Selection");
         Menu m4=new Menu("Find");
         Menu m5=new Menu("View");
         Menu m6=new Menu("Goto");
         Menu m7=new Menu("Tools");
         Menu m8=new Menu("Project");
         Menu m9=new Menu("Preferences");
         Menu m10=new Menu("Help");

         MenuItem mif1 =new MenuItem("New File");
         MenuItem mif2 =new MenuItem("Open File...");
         MenuItem mif3 =new MenuItem("Open Folder...");
         MenuItem mif4 =new MenuItem("Open Recent");
         MenuItem mif5 =new MenuItem("Reopen with Encoding");
         MenuItem mif6 =new MenuItem("Split View");
         MenuItem mif7 =new MenuItem("Save");
         MenuItem mif8 =new MenuItem("Save with Encoding");
         MenuItem mif9 =new MenuItem("Save As...");
         MenuItem mif10 =new MenuItem("Save All");
         MenuItem mif11 =new MenuItem("Print...");
         MenuItem mif12 =new MenuItem("New Window");
         MenuItem mif13 =new MenuItem("Close Window");
         MenuItem mif14 =new MenuItem("Close File");
         MenuItem mif15 =new MenuItem("Revert File");
         MenuItem mif16 =new MenuItem("Close All Files");
         MenuItem mif17 =new MenuItem("Exit");

         MenuItem mie1 =new MenuItem("Undo Paste");
         MenuItem mie2 =new MenuItem("Repeat Paste");
         MenuItem mie3 =new MenuItem("Undo Selection");
         MenuItem mie4 =new MenuItem("Cut");
         MenuItem mie5 =new MenuItem("Copy");
         MenuItem mie6 =new MenuItem("Copy as HTML");
         MenuItem mie7 =new MenuItem("Paste");
         MenuItem mie8 =new MenuItem("Paste and Indent");
         MenuItem mie9 =new MenuItem("Paste From Histroy");
         MenuItem mie10 =new MenuItem("Line");
         MenuItem mie11 =new MenuItem("Comment");
         MenuItem mie12 =new MenuItem("Text");
         MenuItem mie13 =new MenuItem("Tag");
         MenuItem mie14 =new MenuItem("Mark");
         MenuItem mie15 =new MenuItem("code folding");
         MenuItem mie16 =new MenuItem("Convert Case");
         MenuItem mie17 =new MenuItem("Wrap");
         MenuItem mie18 =new MenuItem("Show Completion");
         MenuItem mie19 =new MenuItem("Sort lines");
         MenuItem mie20 =new MenuItem("Sort Lines(Case selective) ");
         MenuItem mie21 =new MenuItem("Permute Lines");
         MenuItem mie22 =new MenuItem("Permute Selection");

         MenuItem mis1 =new MenuItem("Split into Lines");
         MenuItem mis2 =new MenuItem("Single Selection");
         MenuItem mis3 =new MenuItem("Select All");
         MenuItem mis4 =new MenuItem("Expand Selection");
         MenuItem mis5 =new MenuItem("Expand Selection to line");
         MenuItem mis6 =new MenuItem("Expand selection to word");
         MenuItem mis7 =new MenuItem("Expand Selection to Block");
         MenuItem mis8 =new MenuItem("Expand Selection to Paragraph");
         MenuItem mis9 =new MenuItem("Expand Selection to Scope");
         MenuItem mis10 =new MenuItem("Expand Selection to Brackets");
         MenuItem mis11 =new MenuItem("Expand Selection to Indentation");
         MenuItem mis12 =new MenuItem("Add Previous Line");
         MenuItem mis13 =new MenuItem("Add next Line");
         MenuItem mis14 =new MenuItem("Tab Selection"); 

         MenuItem miFind1 =new MenuItem("Find...");
         MenuItem miFind2 =new MenuItem("Find Next");
         MenuItem miFind3 =new MenuItem("Find Previous");
         MenuItem miFind4 =new MenuItem("Incremental Find");
         MenuItem miFind5 =new MenuItem("Replace");
         MenuItem miFind6 =new MenuItem("Replace Next");
         MenuItem miFind7 =new MenuItem("Quick Find");
         MenuItem miFind8 =new MenuItem("Quick Find All");
         MenuItem miFind9 =new MenuItem("Quick add next");
         MenuItem miFind10 =new MenuItem("Quick Skip next");
         MenuItem miFind11 =new MenuItem("Use selection for Find");
         MenuItem miFind12 =new MenuItem("Use Selection for Replace");
         MenuItem miFind13 =new MenuItem("Find in Files...");
         MenuItem miFind14 =new MenuItem("Find Results");
         MenuItem miFind15 =new MenuItem("Cancel Find in files");

         MenuItem mig1 =new MenuItem("Goto Anything...");
         MenuItem mig2 =new MenuItem("Goto symbol...");
         MenuItem mig3 =new MenuItem("Goto Symbol in Project");
         MenuItem mig4 =new MenuItem("Goto defination");
         MenuItem mig5 =new MenuItem("Goto Reference...");
         MenuItem mig6 =new MenuItem("Goto line");
         MenuItem mig7 =new MenuItem("Next Modification");
         MenuItem mig8 =new MenuItem("Previous Modification");
         MenuItem mig9 =new MenuItem("Jump Back");
         MenuItem mig10 =new MenuItem("Jump Forward");
         MenuItem mig11 =new MenuItem("Switch File");
         MenuItem mig12 =new MenuItem("Scroll ");
         MenuItem mig13 =new MenuItem("BookMarks");
         MenuItem mig14 =new MenuItem("Jump to Matching Brackets");
         
         MenuItem miv1 =new MenuItem("Side Bar");
         MenuItem miv2 =new MenuItem("Hide Minimap");
         MenuItem miv3 =new MenuItem("Hide Tabs");
         MenuItem miv4 =new MenuItem("Hide Status Bar");
         MenuItem miv5 =new MenuItem("Hide Menu");
         MenuItem miv6 =new MenuItem("Show Console");
         MenuItem miv7 =new MenuItem("Enter Full Screen");
         MenuItem miv8 =new MenuItem("Enter Distraction free Mode");
         MenuItem miv9 =new MenuItem("Layout");
         MenuItem miv10 =new MenuItem("Groups");
         MenuItem miv11 =new MenuItem("Focus Group");
         MenuItem miv12 =new MenuItem("Move file to group");
         MenuItem miv13 =new MenuItem("Syntax");
         MenuItem miv14 =new MenuItem("Indentation");
         MenuItem miv15 =new MenuItem("Line Endings");
         MenuItem miv16 =new MenuItem("Word Wrap");
         MenuItem miv17 =new MenuItem("Word wrap Column");
         MenuItem miv18 =new MenuItem("Rules");
         MenuItem miv19 =new MenuItem("Spell Check");
         MenuItem miv20 =new MenuItem("Next Misspelling");
         MenuItem miv21 =new MenuItem("Prev Misspelling");
         MenuItem miv22 =new MenuItem("Dictionary");

         MenuItem mit1 =new MenuItem("Command Palette...");
         MenuItem mit2 =new MenuItem("Snippets...");
         MenuItem mit3 =new MenuItem("Build System");
         MenuItem mit4 =new MenuItem("Build");
         MenuItem mit5 =new MenuItem("Build With");
         MenuItem mit6 =new MenuItem("Cancel Build");
         MenuItem mit7 =new MenuItem("Build Results");
         MenuItem mit8 =new MenuItem("Save all on Build");
         MenuItem mit9 =new MenuItem("Record Macro");
         MenuItem mit10 =new MenuItem("Palyback Macro");
         MenuItem mit11 =new MenuItem("Save Macro");
         MenuItem mit12 =new MenuItem("Macros");
         MenuItem mit13 =new MenuItem("Developer");
         MenuItem mit14 =new MenuItem("Install Package Control...");

         MenuItem mip1 =new MenuItem("Open Project...");
         MenuItem mip2 =new MenuItem("Switch Projectr...");
         MenuItem mip3 =new MenuItem("Quick switch Project...");
         MenuItem mip4 =new MenuItem("Open recent");
         MenuItem mip5 =new MenuItem("Save Project as");
         MenuItem mip6 =new MenuItem("Close Project");
         MenuItem mip7 =new MenuItem("Edit Project");
         MenuItem mip8 =new MenuItem("New Workspace for Project"); 
         MenuItem mip9 =new MenuItem("Save workspace as...");
         MenuItem mip10 =new MenuItem("Add folder to project");
         MenuItem mip11 =new MenuItem("Remove all folder to project");
         MenuItem mip12 =new MenuItem("Refresh Folder");

         MenuItem mipr1 =new MenuItem("Browse Packages...");
         MenuItem mipr2 =new MenuItem("settings");
         MenuItem mipr3 =new MenuItem("Settings - Syntax Specific");
         MenuItem mipr4 =new MenuItem("Settings - Distraction free");
         MenuItem mipr5 =new MenuItem("Key Blindings");
         MenuItem mipr6 =new MenuItem("Select Color Scheme...");
         MenuItem mipr7 =new MenuItem("Customize color Scheme");
         MenuItem mipr8 =new MenuItem("Select Theme...");
         MenuItem mipr9 =new MenuItem("Customize theme");
         MenuItem mipr10 =new MenuItem("Font");

         MenuItem mih1 =new MenuItem("Doccumentation");
         MenuItem mih2 =new MenuItem("Report a Bug");
         MenuItem mih3 =new MenuItem("Twiiter");
         MenuItem mih4 =new MenuItem("Indexing Satus...");
         MenuItem mih5 =new MenuItem("Purchase License");
         MenuItem mih6 =new MenuItem("Enter License");
         MenuItem mih7 =new MenuItem("Check for Updates...");
         MenuItem mih8 =new MenuItem("Changelog...");
         MenuItem mih9 =new MenuItem("About Sublime Text");



         
         mb.add(m1);
         mb.add(m2);
         mb.add(m3);
         mb.add(m4);
         mb.add(m5);
         mb.add(m6);
         mb.add(m7);
         mb.add(m8);
         mb.add(m9);
         mb.add(m10);

         m1.add(mif1);
         m1.add(mif2);
         m1.add(mif3);
         m1.add(mif4);
         m1.add(mif5);
         m1.add(mif6);
         m1.add(mif7);
         m1.add(mif8);
         m1.add(mif9);
         m1.add(mif10);
         m1.add(mif11);
         m1.add(mif12);
         m1.add(mif13);
         m1.add(mif14);
         m1.add(mif15);
         m1.add(mif16);
         m1.add(mif17);

         m2.add(mie1);
         m2.add(mie2);
         m2.add(mie3);
         m2.add(mie4);
         m2.add(mie5);
         m2.add(mie6);
         m2.add(mie7);
         m2.add(mie8);
         m2.add(mie9);
         m2.add(mie10);
         m2.add(mie11);
         m2.add(mie12);
         m2.add(mie13);
         m2.add(mie14);
         m2.add(mie15);
         m2.add(mie16);
         m2.add(mie17);
         m2.add(mie18);
         m2.add(mie19);
         m2.add(mie20);
         m2.add(mie21);
         m2.add(mie22);
         
         m3.add(mis1);
         m3.add(mis2);
         m3.add(mis3);
         m3.add(mis4);
         m3.add(mis5);
         m3.add(mis6);
         m3.add(mis7);
         m3.add(mis8);
         m3.add(mis9);
         m3.add(mis10);
         m3.add(mis11);
         m3.add(mis12);
         m3.add(mis13);
         m3.add(mis14);

         m4.add(miFind1);
         m4.add(miFind2);
         m4.add(miFind3);
         m4.add(miFind4);
         m4.add(miFind5);
         m4.add(miFind6);
         m4.add(miFind7);
         m4.add(miFind8);
         m4.add(miFind9);
         m4.add(miFind10);
         m4.add(miFind11);
         m4.add(miFind12);
         m4.add(miFind13);
         m4.add(miFind14);
         m4.add(miFind15);

         m5.add(miv1);
         m5.add(miv2);
         m5.add(miv3);
         m5.add(miv4);
         m5.add(miv5);
         m5.add(miv6);
         m5.add(miv7);
         m5.add(miv8);
         m5.add(miv9);
         m5.add(miv10);
         m5.add(miv11);
         m5.add(miv12);
         m5.add(miv13);
         m5.add(miv14);
         m5.add(miv15);
         m5.add(miv16);
         m5.add(miv17);
         m5.add(miv18);
         m5.add(miv19);
         m5.add(miv20);
         m5.add(miv21);
         m5.add(miv22);
    
         m6.add(mig1);
         m6.add(mig2);
         m6.add(mig3);
         m6.add(mig4);
         m6.add(mig5);
         m6.add(mig6);
         m6.add(mig7);
         m6.add(mig8);
         m6.add(mig9);
         m6.add(mig10);
         m6.add(mig11);
         m6.add(mig12);
         m6.add(mig13);
         m6.add(mig14);

         m7.add(mit1);
         m7.add(mit2);
         m7.add(mit3);
         m7.add(mit4);
         m7.add(mit5);
         m7.add(mit6);
         m7.add(mit7);
         m7.add(mit8);
         m7.add(mit9);
         m7.add(mit10);
         m7.add(mit11);
         m7.add(mit12);
         m7.add(mit13);
         m7.add(mit14);

         m8.add(mip1);
         m8.add(mip2);
         m8.add(mip3);
         m8.add(mip4);
         m8.add(mip5);
         m8.add(mip6);
         m8.add(mip7);
         m8.add(mip8);
         m8.add(mip9);
         m8.add(mip10);
         m8.add(mip11);
         m8.add(mip12);
        
         m9.add(mipr1);
         m9.add(mipr2);
         m9.add(mipr3);
         m9.add(mipr4);
         m9.add(mipr5);
         m9.add(mipr6);
         m9.add(mipr7);
         m9.add(mipr8);
         m9.add(mipr9);
         m9.add(mipr10);

         m10.add(mih1);
         m10.add(mih2);
         m10.add(mih3);
         m10.add(mih4);
         m10.add(mih5);
         m10.add(mih6);
         m10.add(mih7);
         m10.add(mih8);
         m10.add(mih9);
         

        setMenuBar(mb);
        setBackground(Color.LIGHT_GRAY);
        setTitle("Sublime Text");
	 	setSize(700,700);
	 	setVisible(true);

	 }
	 public static void main(String[] args) 
	 {
	 	Subline_menu sm=new Subline_menu();
	 	
	 }
}