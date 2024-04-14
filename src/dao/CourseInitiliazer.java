package dao;

/**
 *
 * @author Low Sin Mun
 */
import adt.SortedDoublyLinkedList;
import entity.*;
import javax.swing.table.DefaultTableModel;

public class CourseInitiliazer {

    private SortedDoublyLinkedList<Course> courseList;

    public CourseInitiliazer(SortedDoublyLinkedList<Course> courseList) {
        this.courseList = courseList;
    }

    public DefaultTableModel initializeCourses() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Faculty");
        model.addColumn("Programme");
        model.addColumn("Course");

        if (model.getRowCount() == 0) {
            //FAFB
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Accounting (Honours)", "BBBE 1033 Economics", "BBDM 1043 Principles of Management", "BMIT 1723 IT Fundamentals and Applications"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bacholor of Business (Honours) Accounting and Finance", "BMIT 1723 IT Fundamentals and Applications", "BBDM 1013 Business Communication", "BBBE 1033 Economics", "BBDM 1043Principles of Management"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Banking and Finance (Honours)", "BBDM 1023 Business Organisation and Management", "BBMF 1813 Principles of Finance", "BBDT 1013 Principles of Marketing", "BAMS 1753 Financial Mathematics", "BBMF 3713 Risk Management"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business Administration (Honours)", "BBDM 2153 Operations Management", "BBBL 2023 Commercial Law", "BBDT 1013 Principles of Marketing", "BMIT 1723 IT Fundamentals and Applications", "BBBE 1033 Economics"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in Business Analytics", "BBDT 3264 Big Data Analytics", "BBDT 3244 Digital Marketing", "BBDM 3303 Entrepreneurship", "BMCS 2123 Natural Language Processing", "BBDT 3314 Business Metrics and Analytics"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Commerce (Honours)", "MPU - 3133 Falsafah dan Isu Semasa", "BJEL 1023 Academic English", "BBDM 3303 Entrepreneurship", "BBBE 1033 Economics", "BBDM 1023 Business Organisation and Management"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Corporate Administration (Honours)", "BBFA 2054 Financial Reporting", "BBMF 2093 Corporate Finance", "Business Strategy", "BBMF 1813 Principles of Finance", "BAMS 1743 Quantitative Methods"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Economics (Honours)", "BBBE 2133 Economics for Strategy", "BBBE 2113 Intermediate Microeconomics", "MPU - 3302 Integrity and Anti-Corruption", "BBBE 2033 Malaysian Economy", "BBBE 3814 Econometrics"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in Entrepreneurship", "BBDM 1013 Business Communication", "BAMS 1743 Quantitative Methods", "BBBE 1033 Economics", "BBDT 1013 Principles of Marketing", "BBBL 2023 Commercial Law"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Finance (Honours)", "BBFA 2054 Financial Reporting", "BBMF 3403 Alternative Investments", "BBMF 2083 Insurance Management", "BBMF 3063 Financial Statement Analysis", "BBMF 3504 Ehtical and Professional Standards"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Finance and Investment (Honours)", "BBFA 1063 Financial Accounting", "BBMF 2093 Corporate Finance"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in Human Resource Management", "BBDM 1063 Organisational Behaviour", "BBDH 2013 Human Resource Management", "BBDM 3013 Business Research", "BBDM 2153 Operations Management"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in International Business", "BBMF 1813 Principles of Finance", "BBDM 2153 Operations Management", "BBDM 1063 Organisational Behaviour", "BBBL 2023 Commercial Law"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) International Business Management", "BBDH 2013 Human Resource Management", "BBDM 3013 Business Research", "BJEL 1023 Academic English", "MPU-3302 Integrity and Anti-Corruption"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in Logistics and Supply Chain Management", "BBMF 1813 Principles of Finance", "BBDM 2153 Operations Management", "BBDM 3303 Entrepreneurship"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Business (Honours) in Marketing", "BBBL 2023 Commercial Law", "BBDT 2094 Retail Management", "BBDH 2013 Human Resource Management", "BBDT 2174 Social Commerce", "BBDM 3194 Strategic Planning and Management"});
            model.addRow(new Object[]{"Faculty of Accountancy, Finance and Business (FAFB)", "Bachelor of Retail Management (Honours)"});

            //FOBE
            model.addRow(new Object[]{"Faculty of Built Environment (FOBE)", "Bachelor of Construction Management and Economics", "BBDM 1043 Principles of Management"});
            model.addRow(new Object[]{"Faculty of Built Environment (FOBE)", "Bachelor of Quantity Surveying", "BTBE 2052 Research Methodology", "BTBE 2023 Civil Engineering Construction Technology", "BTQS 2023 Measurement of Plumbing and Electrical Services", "BTQS 2054 Development Economics", "BTQS 3033 Prices Analysis For External and Plumbing Works"});
            model.addRow(new Object[]{"Faculty of Built Environment (FOBE)", "Bachelor of Science Architecture", "BTAR 1016 Design Studio I", "BTAR 1013 Architectural Graphic Techniques", "BTAR 1052 Principles of Construction and Materials", "BTAR 1012 History of Eastern Architecture", "BTAR 1062 Environmental Science"});

            //FSSH
            model.addRow(new Object[]{"Faculty of Social Science and Humanities (FSSH)", "Bachelor of Hospitality Management", "BBDM 1043 Principles of Management"});
            model.addRow(new Object[]{"Faculty of Social Science and Humanities (FSSH)", "Bachelor of Tourism Management", "MPU - 3232 Entrepreneurship", "BBDM 1043 Principles of Management"});
            model.addRow(new Object[]{"Faculty of Social Science and Humanities (FSSH)", "Bachelor of Early Childhood Education", "BHEL 1913 English Language"});
            model.addRow(new Object[]{"Faculty of Social Science and Humanities (FSSH)", "Bachelor of Arts English with Drama", "BBDM 1013 Business Communication"});
            model.addRow(new Object[]{"Faculty of Social Science and Humanities (FSSH)", "Bachelor of Arts English with Education", "BBBE 3023 Research Methodology"});

            //FCCI
            model.addRow(new Object[]{"Faculty of Communication and Creative Industries (FCCI)", "Bachelor of Communication Studies", "BHCA 1223 Basic Photography Skills"});
            model.addRow(new Object[]{"Faculty of Communication and Creative Industries (FCCI)", "Bachelor of Design in Graphic Design", "BHCA 1213 Introduction to Art"});
            model.addRow(new Object[]{"Faculty of Communication and Creative Industries (FCCI)", "Bachelor of Design in Fashion Design", "BJEL 2013 English for Career", "BHFD 2124 Garment and Pattern Construction II", "BHFD 2133 Software Application for Fashion", "BHFD 2143 Advanced Fashion Design Illustration", "MPU - 3103 Falsafah and Isu Semasa"});

            //FOET
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Machanical Engineering", "BTGE 1013 Engineering Mathematics", "BTMM 2153 Strength of Materials", "BGMC 4263 Heat Transfer"});
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Mechatronic Engineering", "BTGE 2033 Engineering Statistics", "BTMH 4443 Robotic Systems and Design", "BGMC 4282 Finite element Analysis", "BGMC 2183 Dynamics", "BTEH 2223 Microprocessor Systems"});
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Electrical and Electronics Engineering", "BTMH 1313 Industrial Control and Automation", "BACS 2114 Machine Learning"});
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Electronic Engineering Technology", "BGGE 2044 Project Management and Finance", "BTEC 4213 Embedded System", "BGEC 3314 Digital Signal Processing", "BAIT 2123 Internet of Things"});
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Materials and Manufacturing Technology", "BTMR 1313 Electric Circuits"});
            model.addRow(new Object[]{"Faculty of Engineering and Technology (FOET)", "Bachelor of Manufacturing and Industrial Technology", "BTMM 2153 Strength of Materials"});

            //FOAS
            model.addRow(new Object[]{"Faculty of Applied Science (FOAS)", "Bachelor of Science in Analytical Chemistry", "BACH 2163 Polymer Chemistry", "BACH 2223 Transition Elements and Coordination Compounds", "BACH 2243 Instrumental Methods of Chemical Analysis", "BACH 2204 Chemistry Laboratory", "BACH 2253 Environmental Chemistry and Analysis"});
            model.addRow(new Object[]{"Faculty of Applied Science (FOAS)", "Bachelor of Science in Bioscience with Chemistry", "BABS 1213 Integrated Biology", "BABS 1233 Microbiology", "BABS 2213 Principles of Genetics", "BABS 2233 Physiology and Behaviour of Plants", "BABS 1223 Ecology and Biodiversity"});
            model.addRow(new Object[]{"Faculty of Applied Science (FOAS)", "Bachelor of Science in Food Science", "BAFS 2333 Sensory Evaluation", "BAFS 3343 Food Preservation", "BAFS 2344 Food Microbiology II", "BAFS 3523 Therapeutic Nutrition", "BAMS 2414 Statistics Methods for Scientific Analysis"});
            model.addRow(new Object[]{"Faculty of Applied Science (FOAS)", "Bachelor of Science in Nutrition", "BAFS 1353 Food Analysis", "BAFS 1313 Introduction to Food Science"});

            //FOCS
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor Degree in Data Science", "BACS 3183 Advanced Database Management", "BMCS 2013 Data Engineering", "BAIT 3003 Data Warehouse Technology", "BACS 2114 Machine Learning", "BMMS 2074 Statistics for Data Science"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor of Information Systems (Honours) In Enterprise Information Systems", "BAIT 3013 Information Systems Implementation", "BAIT 3043 IS Strategy and Management", "BAIT 3133 Database Administration", "BAIT 2144 Fundamentals of Computer Networks", "BAIT 3003 Data Warehouse Technology"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor of Science in Management Mathematics with Computing", "BAMS 1623 Discrete Mathematics", "BACS 2023 Object-oriented Programming", "BACS 1053 Database Management", "BAIT 3013 Business Intelligence", "BAMS 1753 Financial Mathematics"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor of Interactive Software Technology", "BACS 2163 Software Engineering", "BAIT 2203 Human Computer Interaction", "BAIT 2073 Mobile Application Development", "BACS 2173 Graphic Programming", "BACS 3074 Artificial Intelligence"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor of Information Security", "BAIT 3273 Cloud Computing", "BAIT 2073 Mobile Application Development", "BBMF 3073 Risk Management", "BAIT 2123 Internet of Things", "BMIS 2003 Blockchain Application Development"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor of Software Engineering", "BACS 2063 Data Structure and Algorithm", "BACS 2033 Software Requirements Engineering", "BACS 2083 Formal Methods for Software Engineering", "BACS 2173 Graphics Programming", "BMMS 2633 Advanced Discrete Mathematics"});
            model.addRow(new Object[]{"Faculty of Computer and Information Technology (FOCS)", "Bachelor in Software Systems Development", "BAIT 3343 Agile Software Development", "BAIT 3153 Software Project Management", "BACS 2103 Software Quality Assurance and Testing", "BAIT 1093 Introduction to Computer Security", "BAIT 3273 Cloud Computing"});

        }

        return model;
    }

    public static void main(String[] args) {
        // To illustrate how to use the initializeStudents() method
        SortedDoublyLinkedList<Course> courseList = new SortedDoublyLinkedList<>();
        CourseInitiliazer C = new CourseInitiliazer(courseList);
        DefaultTableModel courseTableModel = C.initializeCourses();
        System.out.println("\nCourses:\n" + courseTableModel);
    }

}
