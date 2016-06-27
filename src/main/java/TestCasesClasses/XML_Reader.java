package TestCasesClasses;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;


import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import TestCasesClasses.LogInClass;

public class XML_Reader {


    public static String[] XMLReader(){
        String[] configuration = new String [8];
        try {
            File inputFile = new File("C:\\Users\\Testing\\IdeaProjects\\TestLogIn\\Configuration Files\\TestLogin.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);

            configuration[0]=userhandler.usernamepassword;
            configuration[1]=userhandler.tagusername;
            configuration[2]=userhandler.tagpassword;
            configuration[3]=userhandler.tagsubmit;
            configuration[4]=userhandler.taglogout;
            configuration[5]=userhandler.pageURL;
            configuration[6]=userhandler.username;

        } catch (Exception e) {
            e.printStackTrace();
        }
    return configuration;
    }
}

class UserHandler extends DefaultHandler {

    boolean bUsernameTag = false;
    boolean bPasswordTag = false;
    boolean bSumitTag = false;
    boolean bLogoutTag = false;
    boolean bUsername = false;
    boolean bPassword = false;
    boolean bURL = false;
    String usernamepassword,tagusername,tagpassword,tagsubmit,taglogout,pageURL,username;

    @Override
    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase("USERNAMETAG")) {
            bUsernameTag = true;
        } else if (qName.equalsIgnoreCase("PASSWORDTAG")) {
            bPasswordTag = true;
        } else if (qName.equalsIgnoreCase("SUBMITTAG")) {
            bSumitTag = true;
        }
        else if (qName.equalsIgnoreCase("USERNAME")) {
            bUsername = true;
        }
        else if (qName.equalsIgnoreCase("PASSWORD")) {
            bPassword = true;
        }
        else if (qName.equalsIgnoreCase("LOGOUTTAG")) {
            bLogoutTag = true;
        }

        else if (qName.equalsIgnoreCase("URL")) {
            bURL= true;
        }

    }


    @Override
    public void characters(char ch[],
                           int start, int length) throws SAXException {


        if (bUsername) {
            System.out.println("USERNAME : "
                    + new String(ch, start, length));
            username=new String(ch, start, length);
            bUsername = false;
        } else if (bPassword) {
            System.out.println("PASSWORD :"
                    + new String(ch, start, length));
            usernamepassword=new String(ch, start, length);
            bPassword = false;
        }
        else if (bUsernameTag) {
            System.out.println("USERNAME TAG NAME"
                    + new String(ch, start, length));
            tagusername=new String(ch, start, length);
            bUsernameTag = false;
        }
        else if (bPasswordTag) {
            System.out.println("PASSWORD TAG NAME"
                    + new String(ch, start, length));
            tagpassword=new String(ch, start, length);
            bPasswordTag = false;
        }
        else if (bSumitTag) {
            System.out.println("TAG SUBMIT: "
                    + new String(ch, start, length));
            tagsubmit=new String(ch, start, length);
            bSumitTag = false;
        } else if (bLogoutTag) {
            System.out.println("TAG LOGOUT: "
                    + new String(ch, start, length));
            taglogout=new String(ch, start, length);
            bLogoutTag = false;

        } else if (bURL) {
            System.out.println("URL: "
                    + new String(ch, start, length));
            pageURL=new String(ch, start, length);
            bURL = false;
        }
    }
}

