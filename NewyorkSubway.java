package newyorksubway;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewyorkSubway {
    String[][] oneline,twoline,threeline,fourline,fiveline,sixline,sevenline,
            aline,bline,cline,dline,eline,fline,gline,jline,lline,mline,nline,
            qline,rline,sline,wline,zline;
    String[] onetran,twotran,threetran,fourtran,fivetran,sixtran,seventran,atran,
            btran,ctran,dtran,etran,ftran,gtran,jtran,ltran,mtran,ntran,qtran,
            rtran,stran,wtran,ztran;
    int[][] onetranadj,twotranadj,threetranadj,fourtranadj,fivetranadj,sixtranadj,seventranadj,atranadj,
            btranadj,ctranadj,dtranadj,etranadj,ftranadj,gtranadj,jtranadj,ltranadj,mtranadj,ntranadj,qtranadj,
            rtranadj,stranadj,wtranadj,ztranadj;
    int onet,twot,threet,fourt,fivet,sixt,sevent,at,bt,ct,dt,et,ft,gt,jt,lt,mt,nt,qt,rt,st,wt,zt;
    
    void initRoutes(){
        oneline=new String[][]{{"Van Cortlandt Park-242 St","No"},{"238 St","No"},{"231 St","No"},{"Marble Hill-225 St","No"},
            {"215 St","No"},{"207 St","No"},{"Dyckman St","No"},{"191 St","No"},{"181 St","No"},{"168 St","Yes"},
            {"157 St","No"},{"145 St","No"},{"137 St-City College","No"},{"125 St","No"},{"116 St-Columbia U","No"},
            {"Cathedral Pkwy(110 St)","No"},{"103 St","No"},{"96 St","Yes"},{"86 St","No"},{"79 St","No"},
            {"72 St","Yes"},{"66 St-Lincoln Center","No"},{"59 St-Columbus Circle","Yes"},{"50 St","No"},
            {"Times Sq-42 St","Yes"},{"34 St-Penn Station","Yes"},{"28 St","No"},{"23 St","No"},{"18 St","No"},
            {"14 St","Yes"},{"Christopher St-Sheridan Sq","No"},{"Houston St","No"},{"Canal St","No"},{"Franklin St","No"},
            {"Chambers St","Yes"},{"Cortlandt St-World Trade Ctr","No"},{"Rector St","No"},{"South Ferry","Yes"}};
        
        twoline=new String[][]{{"Wakefield St","No"},{"Nereid Av","Yes"},{"233 St","Yes"},{"225 St","No"},
            {"219 St","No"},{"Gun Hill Rd","Yes"},{"Burke Av","No"},{"Allerton Av","No"},{"Pelham Pkwy","Yes"},
            {"Bronx Park East","No"},{"E 180 St","Yes"},{"West Farms Sq-E Tremont Av","No"},{"174 St","No"},
            {"Freeman St","No"},{"Simpson St","No"},{"Intervale Av","No"},{"Prospect Av","No"},{"Jackson Av","No"},
            {"3 Av-149 St","Yes"},{"149 St-Grand Concourse","Yes"},{"135 St","Yes"},{"125 St","No"},{"116 St","No"},{"Central Pk North-110 St","No"},
            {"96 St","Yes"},{"86 St","No"},{"79 St","No"},{"72 St","Yes"},{"66 St-Lincoln Ctr","No"},{"59 St-Columbus Circle","Yes"},
            {"50 St","No"},{"Times Sq-42 St","Yes"},{"34 St-Penn Station","Yes"},{"28 St","No"},{"23 St","No"},{"18 St","No"},
            {"14 St","Yes"},{"Christopher St-Sheridan Sq","No"},{"Houston St","No"},{"Canal St","No"},{"Franklin St","No"},
            {"Chambers St","Yes"},{"Park Place","Yes"},{"Fulton St","Yes"},{"Wall St","No"},{"Clark St","No"},{"Borough Hall","Yes"},
            {"Hoyt St","No"},{"Nevins St","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Bergen St","No"},{"Grand Army Plaza","No"},
            {"Eastern Pkwy-Bklyn Museum","No"},{"Franklin Av","Yes"},{"President St","No"},{"Sterling St","No"},{"Winthrop St","No"},
            {"Church Av","No"},{"Beverly Rd","No"},{"Newkirk Av","No"},{"Flatbush Av-Brooklyn College","Yes"}};
        
        threeline=new String[][]{{"Harlem-148 St","No"},{"145 St","No"},{"135 St","Yes"},{"125 St","No"},{"116 St","No"},{"Central Park North-110 St","No"},
            {"96 St","Yes"},{"72 St","Yes"},{"Times Sq-42 St","Yes"},{"34 St-Penn Station","Yes"},{"14 St","Yes"},{"Chambers St","Yes"},
            {"Park Place","Yes"},{"Fulton St","Yes"},{"Wall St","No"},{"Clark St","No"},{"Borough Hall","Yes"},{"Hoyt St","No"},
            {"Nevins St","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Bergen St","No"},{"Grand Army Plaza","No"},{"Eastern Pkwy-Bklyn Museum","No"},
            {"Franklin Av","Yes"},{"Nostrand Av","No"},{"Kingston Av","No"},{"Crown Hts-Utica Av","Yes"},{"Sutter Av-Rutland Rd","No"},{"Saratoga Av","No"},
            {"Rockaway Av","No"},{"Junius St","No"},{"Pennsylvania Av","No"},{"Van Siclen Av","No"},{"New Lots Av","No"}};
        
        fourline=new String[][]{{"Woodlawn","No"},{"Mosholu Pkwy","No"},{"Bedford Pk Blvd-Lehman College","No"},{"Kingsbridge Rd","No"},{"Fordham Rd","No"},
            {"183 St","No"},{"Burnside Av","No"},{"176 St","No"},{"Mt Eden Av","No"},{"170 St","No"},{"167 St","No"},{"161 St-Yankee Stadium","Yes"},
            {"149 St-Grand Concourse","Yes"},{"138 St-Grand Concourse","Yes"},{"125 St","Yes"},{"116 St","No"},{"110 St","No"},{"103 St","No"},
            {"96 St","No"},{"86 St","Yes"},{"77 St","No"},{"68 St-Hunter College","No"},{"59 St","Yes"},{"51 St","Yes"},{"Grand Central-42 St","Yes"},
            {"33 St","No"},{"28 St","No"},{"23 St","No"},{"14 St-Union Sq","Yes"},{"Astor Pl","No"},{"Bleecker St","Yes"},{"Spring St","No"},{"Canal St","Yes"},
            {"Brooklyn Bridge-City Hall","Yes"},{"Fulton St","Yes"},{"Wall St","No"},{"Bowling Green","Yes"},{"Borough Hall","Yes"},{"Nevins St","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},
            {"Bergen St","No"},{"Grand Army Plaza","No"},{"Eastern Pkwy-Bklyn Museum","No"},{"Franklin Av","Yes"},{"Nostrand Av","No"},{"Kingston Av","No"},{"Crown Hts-Utica Av","Yes"},
            {"Sutter Av-Rutland Rd","No"},{"Saratoga Av","No"},{"Rockaway Av","No"},{"Junius St","No"},{"Pennsylvania Av","No"},{"Van Siclen Av","No"},{"New Lots Av","No"}};
        
        fiveline=new String[][]{{"Nereid Av","Yes"},{"233 St","Yes"},{"225 St","No"},{"219 St","No"},{"Gun Hill Rd","No"},{"Burke Av","No"},{"Allerton Av","No"},{"Pelham Pkwy","No"},{"Bronx Park East","No"},{"Eastchester-Dyre Av","No"},{"Baychester Av","No"},{"Gun Hill Rd-Seymour Av","No"},{"Pelham Pkwy-Williamsbridge Rd","No"},{"Morris Pk","No"},
            {"E 180 St","Yes"},{"West Farms Sq-E Tremont Av","No"},{"174 St","No"},{"Freeman St","No"},{"Simpson St","No"},{"Intervale Av","No"},{"Prospect Av","No"},
            {"Jackson Av","No"},{"3 Av-149 St","Yes"},{"149 St-Grand Concourse","Yes"},{"138 St-Grand Concourse","Yes"},{"125 St","Yes"},{"86 St","Yes"},{"59 St","Yes"},
            {"Grand Central-42 St","Yes"},{"14 St-Union Sq","Yes"},{"Brooklyn Bridge-City Hall","Yes"},{"Fulton St","Yes"},{"Wall St","Yes"},{"Bowling Green","Yes"},
            {"Borough Hall","Yes"},{"Nevins St","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Franklin Av","Yes"},{"President St","No"},{"Sterling St","No"},
            {"Winthrop St","No"},{"Church Av","No"},{"Beverly Rd","No"},{"Newkirk Av","No"},{"Flatbush Av-Brooklyn College","Yes"}};
        
        sixline=new String[][]{{"Pelham Bay Park","No"},{"Buhre Av","No"},{"Middletown Rd","No"},{"Westchester Sq-E Tremont Av","No"},{"Zerega Av","No"},{"Castle Hill Av","No"},
            {"Parkchester","No"},{"St Lawrence Av","No"},{"Morrison Av-Soundview","No"},{"Elder Av","No"},{"Whitlock Av","No"},{"Hunts Point Av","No"},{"Longwood Av","No"},{"E 149 St","No"},
            {"E 143 St-St Mary's St","No"},{"Cypress Av","No"},{"Brook Av","No"},{"3 Av-138 St","No"},{"125 St","Yes"},{"116 St","No"},{"110 St","No"},{"103 St","No"},{"96 St","No"},{"86 St","Yes"},
            {"77 St","No"},{"68 St-Hunter College","No"},{"59 St","Yes"},{"51 St","Yes"},{"Grand Central-42 St","Yes"},{"33 St","No"},{"28 St","No"},{"23 St","No"},{"14 St-Union Sq","Yes"},
            {"Astor Pl","No"},{"Bleecker St","Yes"},{"Spring St","No"},{"Canal St","Yes"},{"Brooklyn Bridge-City Hall","Yes"}};
        
        sevenline=new String[][]{{"34 St-Hudson Yards","No"},{"Times Sq-42 St","Yes"},{"5 Av","Yes"},{"Grand Central-42 St","Yes"},{"Vernon Blvd-Jackson Av","No"},{"Hunters Point Av","No"},{"Court Sq","Yes"},
            {"Queensboro Plaza","Yes"},{"33 St-Rawson St","No"},{"40 St-Lowery St","No"},{"46 St-Bliss St","No"},{"52 St","No"},{"61 St-Woodside","No"},{"69 St","No"},{"74 St-Broadway","Yes"},{"82 St-Jackson Hts","No"},
            {"90 St-Elmhurst Av","No"},{"Junction Blvd","No"},{"103 St-Corona Plaza","No"},{"111 St","No"},{"Mets-Willets Pt","No"},{"Flushing-Main St","No"}};
        
        aline=new String[][]{{"Inwood-207 St","No"},{"Dyckman St","No"},{"190 St","No"},{"181 St","No"},{"175 St","No"},{"168 St","Yes"},{"163 St-Amsterdam Av","No"},{"155 St","No"},{"145 St","Yes"},
            {"135 St","No"},{"125 St","Yes"},{"116 St","No"},{"Cathedral Pkwy(110 St)","No"},{"103 St","No"},{"96 St","No"},{"86 St","No"},{"81 St-Museum of Natural History","No"},{"72 St","No"},{"59 St-Columbus Circle","Yes"},
            {"50 St","Yes"},{"42 St-Port Authority Bus Terminal","Yes"},{"34 St-Penn Station","Yes"},{"23 St","No"},{"14 St","Yes"},{"W 4 St-Washington Sq","Yes"},{"Spring St","No"},{"Canal St","Yes"},{"Chambers St","Yes"},
            {"Fulton St","Yes"},{"High St","No"},{"Jay St-MetroTech","Yes"},{"Hoyt-Schermerhorn Sts","Yes"},{"Lafayette Av","No"},{"Clinton-Washington Avs","No"},{"Franklin Av","Yes"},{"Nostrand Av","Yes"},
            {"Kingston-Throop Avs","No"},{"Utica Av","Yes"},{"Ralph Av","No"},{"Rockaway Av","No"},{"Broadway Junction","Yes"},{"Liberty Av","No"},{"Van Siclen Av","No"},{"Shepherd Av","No"},{"Euclid Av","Yes"},{"Grant Av","No"},
            {"80 St","No"},{"88 St","No"},{"Rockaway Blvd","No"},{"Aqueduct Racetrack","No"},{"Aqueduct North Conduit Av","No"},{"Howard Bch-JFK Airport","No"},{"Broad Channel","No"},
            {"Beach 67 St","No"},{"Beach 60 St","No"},{"Beach 44 St","No"},{"Beach 36 St","No"},{"Beach 25 St","No"},{"Far Rockaway-Mott Av","No"}};
        
        bline=new String[][]{{"Bedford Park Blvd","Yes"},{"Kingsbridge Rd","No"},{"Fordham Rd","Yes"},{"182-183 Sts","No"},{"Tremont Av","Yes"},{"174-175 Sts","No"},{"170 St","No"},{"167 St","No"},{"161 St-Yankee Stadium","Yes"},
            {"155 St","No"},{"145 St","Yes"},{"135 St","No"},{"125 St","Yes"},{"116 St","No"},{"Cathedral Pkwy(110 St)","No"},{"103 St","No"},{"96 St","No"},{"86 St","No"},{"81 St-Museum of Natural History","No"},{"72 St","No"},{"59 St-Columbus Circle","Yes"},
            {"7 Av","Yes"},{"47-50 Sts-Rockefeller Ctr","Yes"},{"42 St-Bryant Pk","Yes"},{"34 St-Herald Sq","Yes"},{"W 4 St-Washington Sq","Yes"},{"Broadway-Lafayette St","Yes"},{"Grand St","Yes"},{"DeKalb Av","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"7 Av","Yes"},{"Prospect Pk","Yes"},{"Church Av","Yes"},
            {"Newkirk Plaza","Yes"},{"Kings Hwy","Yes"},{"Sheepshead Bay","Yes"},{"Brighton Beach","Yes"}};
        
        cline=new String[][]{{"168 St","Yes"},{"163 St-Amsterdam Av","No"},{"155 St","No"},{"145 St","Yes"},{"135 St","No"},{"125 St","Yes"},{"116 St","No"},{"Cathedral Pkwy(110 St)","No"},{"103 St","No"},{"96 St","No"},{"86 St","No"},
            {"81 St-Museum of Natural History","No"},{"72 St","No"},{"59 St-Columbus Circle","Yes"},{"50 St","Yes"},{"42 St-Port Authority Bus Terminal","Yes"},{"34 St-Penn Station","Yes"},{"23 St","No"},{"14 St","Yes"},{"W 4 St-Washington Sq","Yes"},
            {"Spring St","No"},{"Canal St","Yes"},{"Chambers St","Yes"},{"Fulton St","Yes"},{"High St","No"},{"Jay St-MetroTech","Yes"},{"Hoyt-Schermerhorn Sts","Yes"},{"Lafayette Av","No"},{"Clinton-Washington Avs","No"},{"Franklin Av","Yes"},
            {"Nostrand Av","Yes"},{"Kingston-Throop Avs","No"},{"Utica Av","Yes"},{"Ralph Av","No"},{"Rockaway Av","No"},{"Broadway Junction","Yes"},{"Liberty Av","No"},{"Van Siclen Av","No"},{"Shepherd Av","No"},{"Euclid Av","Yes"}};
        
        dline=new String[][]{{"Norwood-205 St","No"},{"Bedford Park Blvd","Yes"},{"Kingsbridge Rd","No"},{"Fordham Rd","Yes"},{"182-183 Sts","No"},{"Tremont Av","Yes"},{"174-175 Sts","No"},{"170 St","No"},{"167 St","No"},{"161 St-Yankee Stadium","Yes"},
            {"155 St","No"},{"145 St","Yes"},{"125 St","Yes"},{"59 St-Columbus Circle","Yes"},{"7 Av","Yes"},{"47-50 Sts-Rockefeller Ctr","Yes"},{"42 St-Bryant Pk","Yes"},{"34 St-Herald Sq","Yes"},{"W 4 St-Washington Sq","Yes"},{"Broadway-Lafayette St","Yes"},
            {"Grand St","Yes"},{"DeKalb Av","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Union St","Yes"},{"4 Av-9 St","Yes"},{"Prospect Av","Yes"},{"25 St","Yes"},{"36 St","Yes"},{"9 Av","No"},{"Ft Hamilton Pkwy","No"},{"50 St","No"},{"55 St","No"},{"62 St","Yes"},
            {"71 St","No"},{"79 St","No"},{"18 Av","No"},{"20 Av","No"},{"Bay Pkwy","No"},{"25 Av","No"},{"Bay 50 St","No"},{"Coney IslandS-tillwell Av","Yes"}};
        
        eline=new String[][]{{"Jamaica Center-Parsons/Archer","Yes"},{"Sutphin Blvd-Archer Av-JFK Airport","Yes"},{"Jamaica-Van Wyck","No"},{"Briarwood","Yes"},{"Kew Gardens-Union Turnpike","Yes"},{"75 Av","No"},{"Forest Hills-71 Av","Yes"},{"67 Av","No"},{"63 Dr-Rego Park","No"},{"Woodhaven Blvd","No"},{"Grand Av-Newtown","No"},{"Elmhurst Av","No"},
            {"Jackson Hts-Roosevelt Av","Yes"},{"65 St","No"},{"Northern Blvd","No"},{"46 St","No"},{"Steinway St","No"},{"36 St","No"},{"Queens Plaza","No"},{"Court Sq","Yes"},{"5 Av/53 St","Yes"},{"7 Av","Yes"},{"50 St","Yes"},{"42 St-Port Authority Bus Terminal","Yes"},{"34 St-Penn Station","Yes"},
            {"23 St","No"},{"14 St","Yes"},{"W 4 St-Washington Sq","Yes"},{"Spring St","No"},{"Canal St","Yes"},{"World Trade Centre","Yes"}};
        
        fline=new String[][]{{"Jamaica-179 St","No"},{"169 St","No"},{"Parsons Blvd","No"},{"Sutphin Blvd","No"},{"Briarwood","Yes"},{"Kew Gardens-Union Turnpike","Yes"},{"75 Av","No"},{"Forest Hills-71 Av","Yes"},{"Jackson Hts-Roosevelt Av","Yes"},{"21 St-Queensbridge","No"},
            {"Roosevelt Island","No"},{"Lexington Av/63 St","Yes"},{"57 St","No"},{"47-50 Sts-Rockefeller Ctr","Yes"},{"42 St-Bryant Pk","Yes"},{"34 St-Herald Sq","Yes"},{"23 St","No"},{"14 St","Yes"},{"W 4 St-Washington Sq","Yes"},{"Broadway-Lafayette St","Yes"},{"2 Av","No"},
            {"Delancey St-Essex St","Yes"},{"East Broadway","No"},{"York St","No"},{"Jay St-MetroTech","Yes"},{"Bergen St","Yes"},{"Carroll St","Yes"},{"Smith-9 Sts","No"},{"4 Av-9 St","Yes"},{"7 Av","No"},{"15 St-Prospect Park","No"},{"Fort Hamilton Pkwy","No"},{"Church Av","Yes"},{"Ditmas Av","No"},
            {"18 Av","No"},{"Avenue I","No"},{"Bay Pkwy","No"},{"Avenue N","No"},{"Avenue P","No"},{"Kings Hwy","No"},{"Avenue U","No"},{"Avenue X","No"},{"Neptune Av","No"},{"W 8 St-NY Aquarium","Yes"},{"Coney Island-Stillwell Av","Yes"}};
        
        gline=new String[][]{{"Court Sq","Yes"},{"21 St","No"},{"Greenpoint Av","No"},{"Nassau Av","No"},{"Metropolitan Av","Yes"},{"Broadway","No"},{"Flushing Av","No"},{"Myrtle-Willoughby Avs","No"},{"Bedford-Nostrand Avs","No"},{"Classon Av","No"},{"Clinton-Washington Avs","No"},{"Fulton St","No"},{"Hoyt-Schermerhorn Sts","Yes"},{"Bergen St","Yes"},{"Carroll St","Yes"},
            {"Smith-9 Sts","No"},{"4 Av-9 St","Yes"},{"7 Av","No"},{"15 St-Prospect Park","No"},{"Fort Hamilton Pkwy","No"},{"Church Av","Yes"}};
        
        jline=new String[][]{{"Broad St","No"},{"Fulton St","Yes"},{"Brooklyn Bridge-City Hall","Yes"},{"Canal St","Yes"},{"Bowery","No"},{"Delancey St-Essex St","Yes"},{"Marcy Av","Yes"},{"Hewes St","No"},{"Lorimer St","No"},{"Flushing Av","No"},{"Myrtle Av","Yes"},{"Kosciusko St","No"},{"Gates Av","No"},{"Halsey St","No"},{"Chauncey St","No"},
            {"Broadway Juncton","Yes"},{"Alabama Av","No"},{"Van Siclen Av","No"},{"Cleveland St","No"},{"Norwood Av","No"},{"Crescent St","No"},{"Cypress Hills","No"},{"75 St-Elderts Lane","No"},{"85 St-Forest Pkwy","No"},{"Woodhaven Blvd","No"},{"104 St","No"},{"111 St","No"},
            {"121 St","No"},{"Sutphin Blvd-Archer Av-JFK Airport","Yes"},{"Jamaica Ctr-Parsons/Archer","Yes"}};
        
        zline=new String[][]{{"Broad St","No"},{"Fulton St","Yes"},{"Brooklyn Bridge-City Hall","Yes"},{"Canal St","Yes"},{"Bowery","No"},{"Delancey St-Essex St","Yes"},{"Marcy Av","Yes"},{"Myrtle Av","Yes"},{"Gates Av","No"},{"Chauncey St","No"},{"Broadway Juncton","Yes"},{"Alabama Av","No"},{"Van Siclen Av","No"},{"Norwood Av","No"},{"Crescent St","No"},
        {"75 St-Elderts Lane","No"},{"Woodhaven Blvd","No"},{"104 St","No"},{"121 St","No"},{"Sutphin Blvd-Archer Av-JFK Airport","Yes"},{"Jamaica Ctr-Parsons/Archer","Yes"}};
        
        lline=new String[][]{{"8 Av","Yes"},{"14 St","Yes"},{"14 St-Union Sq","Yes"},{"3 Av","No"},{"1 Av","No"},{"Bedford Av","No"},{"Metropolitan Av","Yes"},{"Graham Av","No"},{"Grand St","No"},{"Montrose Av","No"},{"Morgan Av","No"},{"Jefferson St","No"},{"DeKalb Av","No"},{"Myrtle-Wyckoff Avs","Yes"},{"Halsey St","No"},{"Wilson Av","No"},{"Bushwick Av","No"},{"Broadway Junction","Yes"},{"Atlantic Av","No"},{"Sutter Av","No"},
            {"Livonia Av","No"},{"New Lots Av","No"},{"East 105 St","No"},{"Canarsie-Rockaway Pkwy","No"}};
        
        mline=new String[][]{{"Forest Hills-71 Av","Yes"},{"67 Av","No"},{"63 Dr-Rego Park","No"},{"Woodhaven Blvd","No"},{"Grand Av-Newtown","No"},{"Elmhurst Av","No"},{"Jackson Hts-Roosevelt Av","Yes"},{"65 St","No"},{"Northern Blvd","No"},{"46 St","No"},{"Steinway St","No"},{"36 St","No"},{"Queens Plaza","Yes"},{"Court Sq","Yes"},
            {"Lexington Av/53 St","Yes"},{"5 Av/53 St","Yes"},{"47-50 Sts-Rockefeller Ctr","Yes"},{"42 St-Bryant Pk","Yes"},{"34 St-Herald Sq","Yes"},{"23 St","No"},{"14 St","Yes"},{"W 4 St-Washington Sq","Yes"},{"Broadway-Lafayette St","Yes"},{"Delancey St-Essex St","Yes"},{"Marcy Av","Yes"},{"Hewes St","No"},{"Lorimer St","No"},{"Flushing Av","No"},
            {"Myrtle Av","Yes"},{"Central Av","No"},{"Knickerbocker Av","No"},{"Myrtle-Wyckoff Avs","Yes"},{"Seneca Av","No"},{"Forest Av","No"},{"Fresh Pond Rd","No"},{"Middle Village-Metropolitan Av","No"}};
        
        nline=new String[][]{{"Astoria-Ditmars Blvd","Yes"},{"Astoria Blvd","No"},{"30 Av","No"},{"Broadway","No"},{"36 Av","No"},{"39 Av","No"},{"Queensboro Plaza","Yes"},{"59 St","Yes"},{"5 Av/59 St","No"},{"57 St-7 Av","Yes"},{"49 St","No"},{"Times Sq-42 St","Yes"},{"34 St-Herald Sq","Yes"},{"28 St","Yes"},{"23 St","Yes"},{"14 St-Union Sq","Yes"},{"8 St-NYU","Yes"},
            {"Prince St","Yes"},{"Canal St","Yes"},{"DeKalb Av","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Union St","No"},{"4 Av-9 St","Yes"},{"Prospect Av","No"},{"25 St","No"},{"36 St","Yes"},{"45 St","No"},{"53 St","No"},{"59 St","Yes"},{"8 Av","No"},{"Ft Hamilton Pkwy","No"},{"62 St","Yes"},{"18 Av","No"},{"20 Av","No"},
            {"Bay Pkwy","No"},{"Kings Hwy","No"},{"Avenue U","No"},{"86 St","No"},{"Coney Island-Stillwell Av","Yes"}};
        
        qline=new String[][]{{"57 St-7 Av","Yes"},{"49 St","Yes"},{"Times Sq-42 St","Yes"},{"34 St-Herald Sq","Yes"},{"28 St","Yes"},{"23 St","Yes"},{"14 St-Union Sq","Yes"},{"8 St-NYU","Yes"},{"Prince St","Yes"},{"Canal St","Yes"},{"DeKalb Av","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"7 Av","Yes"},{"Prospect Pk","Yes"},{"Parkside Av","No"},{"Church Av","Yes"},
            {"Beverley Rd","No"},{"Cortelyou Rd","No"},{"Newkirk Plaza","Yes"},{"Avenue H","No"},{"Avenue J","No"},{"Avenue M","No"},{"Kings Hwy","Yes"},{"Avenue U","No"},{"Neck Rd","No"},{"Sheepshead Bay","Yes"},{"Brighton Beach","Yes"},{"Ocean Pkwy","No"},{"W 8 St-NY Aquarium","Yes"},{"Coney Island-Stillwell Av","Yes"}};
        
        rline=new String[][]{{"Forest Hills-71 Av","Yes"},{"67 Av","No"},{"63 Dr-Rego Park","No"},{"Woodhaven Blvd","No"},{"Grand Av-Newtown","No"},{"Elmhurst Av","No"},{"Jackson Hts-Roosevelt Av","Yes"},{"65 St","No"},{"Northern Blvd","No"},{"46 St","No"},{"Steinway St","No"},{"36 St","No"},{"Queens Plaza","Yes"},{"59 St","Yes"},{"5 Av/59 St","No"},{"57 St-7 Av","Yes"},
            {"49 St","No"},{"Times Sq-42 St","Yes"},{"34 St-Herald Sq","Yes"},{"28 St","No"},{"23 St","No"},{"14 St-Union Sq","Yes"},{"8 St-NYU","Yes"},{"Prince St","Yes"},{"Canal St","Yes"},{"City Hall","No"},{"Cortlandt St","No"},{"Rector St","No"},{"South Ferry","Yes"},{"Borough Hall","Yes"},{"Jay St-MetroTech","Yes"},{"DeKalb Av","Yes"},{"Atlantic Av-Barclays Ctr","Yes"},{"Union St","No"},{"4 Av-9 St","Yes"},{"Prospect Av","No"},
            {"25 St","No"},{"36 St","Yes"},{"45 St","No"},{"53 St","No"},{"59 St","Yes"},{"Bay Ridge Av","No"},{"77 St","No"},{"86 St","No"},{"Bay Ridge-95 St","No"}};
        
        sline=new String[][]{{"Franklin Av","Yes"},{"Park Pl","No"},{"Eastern Pkwy-Bklyn Museum","Yes"},{"Prospect Park","Yes"}};
        
        wline=new String[][]{{"Astoria-Ditmars Blvd","Yes"},{"Astoria Blvd","No"},{"30 Av","No"},{"Broadway","No"},{"36 Av","No"},{"39 Av","No"},{"Queensboro Plaza","Yes"},{"59 St","Yes"},{"5 Av/59 St","No"},{"57 St-7 Av","Yes"},{"49 St","No"},{"Times Sq-42 St","Yes"},{"34 St-Herald Sq","Yes"},{"28 St","Yes"},{"23 St","Yes"},{"14 St-Union Sq","Yes"},{"8 St-NYU","Yes"},
            {"Prince St","Yes"},{"Canal St","Yes"},{"City Hall","No"},{"Cortlandt St","No"},{"Rector","No"},{"South Ferry","Yes"}};    
    
        onet=9;
        twot=22;
        threet=14;
        fourt=19;
        fivet=20;
        sixt=9;
        sevent=6;
        at=19;
        bt=23;
        ct=19;
        dt=23;
        et=18;
        ft=19;
        gt=7;
        jt=9;
        zt=9;
        lt=6;
        mt=16;
        nt=19;
        wt=13;
        qt=21;
        rt=19;
        st=3;
    }
    
    void inittran(){
        onetran=new String[onet];
        int count=0;
        for(int i=0;i<oneline.length;i++){
            if(oneline[i][1].equals("Yes")){
                onetran[count]=oneline[i][0];
                count++;
            }
        }
        
        twotran=new String[twot];
        count=0;
        for(int i=0;i<twoline.length;i++){
            if(twoline[i][1].equals("Yes")){
                twotran[count]=twoline[i][0];
                count++;
            }
        }
        
        threetran=new String[threet];
        count=0;
        for(int i=0;i<threeline.length;i++){
            if(threeline[i][1].equals("Yes")){
                threetran[count]=threeline[i][0];
                count++;
            }
        }
        
        fourtran=new String[fourt];
        count=0;
        for(int i=0;i<fourline.length;i++){
            if(fourline[i][1].equals("Yes")){
                fourtran[count]=fourline[i][0];
                count++;
            }
        }
        
        fivetran=new String[fivet];
        count=0;
        for(int i=0;i<fiveline.length;i++){
            if(fiveline[i][1].equals("Yes")){
                fivetran[count]=fiveline[i][0];
                count++;
            }
        }
        
        sixtran=new String[sixt];
        count=0;
        for(int i=0;i<sixline.length;i++){
            if(sixline[i][1].equals("Yes")){
                sixtran[count]=sixline[i][0];
                count++;
            }
        }
        
        seventran=new String[onet];
        count=0;
        for(int i=0;i<sevenline.length;i++){
            if(sevenline[i][1].equals("Yes")){
                seventran[count]=sevenline[i][0];
                count++;
            }
        }
        
        atran=new String[at];
        count=0;
        for(int i=0;i<aline.length;i++){
            if(aline[i][1].equals("Yes")){
                atran[count]=aline[i][0];
                count++;
            }
        }
        
        btran=new String[bt];
        count=0;
        for(int i=0;i<bline.length;i++){
            if(bline[i][1].equals("Yes")){
                btran[count]=bline[i][0];
                count++;
            }
        }
        
        ctran=new String[ct];
        count=0;
        for(int i=0;i<cline.length;i++){
            if(cline[i][1].equals("Yes")){
                ctran[count]=cline[i][0];
                count++;
            }
        }
        
        dtran=new String[dt];
        count=0;
        for(int i=0;i<dline.length;i++){
            if(dline[i][1].equals("Yes")){
                dtran[count]=dline[i][0];
                count++;
            }
        }
        
        etran=new String[et];
        count=0;
        for(int i=0;i<eline.length;i++){
            if(eline[i][1].equals("Yes")){
                etran[count]=eline[i][0];
                count++;
            }
        }
        
        ftran=new String[ft];
        count=0;
        for(int i=0;i<fline.length;i++){
            if(fline[i][1].equals("Yes")){
                ftran[count]=fline[i][0];
                count++;
            }
        }
        
        gtran=new String[gt];
        count=0;
        for(int i=0;i<gline.length;i++){
            if(gline[i][1].equals("Yes")){
                gtran[count]=gline[i][0];
                count++;
            }
        }
        
        jtran=new String[jt];
        count=0;
        for(int i=0;i<jline.length;i++){
            if(jline[i][1].equals("Yes")){
                jtran[count]=jline[i][0];
                count++;
            }
        }
        
        ltran=new String[lt];
        count=0;
        for(int i=0;i<lline.length;i++){
            if(lline[i][1].equals("Yes")){
                ltran[count]=lline[i][0];
                count++;
            }
        }
        
        mtran=new String[mt];
        count=0;
        for(int i=0;i<mline.length;i++){
            if(mline[i][1].equals("Yes")){
                mtran[count]=mline[i][0];
                count++;
            }
        }
        
        ntran=new String[nt];
        count=0;
        for(int i=0;i<nline.length;i++){
            if(nline[i][1].equals("Yes")){
                ntran[count]=nline[i][0];
                count++;
            }
        }
        
        qtran=new String[qt];
        count=0;
        for(int i=0;i<qline.length;i++){
            if(qline[i][1].equals("Yes")){
                qtran[count]=qline[i][0];
                count++;
            }
        }
        
        rtran=new String[rt];
        count=0;
        for(int i=0;i<rline.length;i++){
            if(rline[i][1].equals("Yes")){
                rtran[count]=rline[i][0];
                count++;
            }
        }
        
        stran=new String[st];
        count=0;
        for(int i=0;i<sline.length;i++){
            if(sline[i][1].equals("Yes")){
                stran[count]=sline[i][0];
                count++;
            }
        }
        
        wtran=new String[wt];
        count=0;
        for(int i=0;i<wline.length;i++){
            if(wline[i][1].equals("Yes")){
                wtran[count]=wline[i][0];
                count++;
            }
        }
        
        ztran=new String[zt];
        count=0;
        for(int i=0;i<zline.length;i++){
            if(zline[i][1].equals("Yes")){
                ztran[count]=zline[i][0];
                count++;
            }
        }
    }
    
    void tranadj(){
        onetranadj=new int[onet][23];
        twotranadj=new int[twot][23];
        threetranadj=new int[threet][23];
        fourtranadj=new int[fourt][23];
        fivetranadj=new int[fivet][23];
        sixtranadj=new int[sixt][23];
        seventranadj=new int[sevent][23];
        atranadj=new int[at][23];
        btranadj=new int[bt][23];
        ctranadj=new int[ct][23];
        dtranadj=new int[dt][23];
        etranadj=new int[et][23];
        ftranadj=new int[ft][23];
        gtranadj=new int[gt][23];
        jtranadj=new int[jt][23];
        ltranadj=new int[lt][23];
        mtranadj=new int[mt][23];
        ntranadj=new int[nt][23];
        qtranadj=new int[qt][23];
        rtranadj=new int[rt][23];
        stranadj=new int[st][23];
        wtranadj=new int[wt][23];
        ztranadj=new int[zt][23];
        
        for(int i=0;i<onet;i++)
            for(int j=0;j<23;j++)
                onetranadj[i][j]=0;
        
        for(int i=0;i<twot;i++)
            for(int j=0;j<23;j++)
                twotranadj[i][j]=0;
        
        for(int i=0;i<threet;i++)
            for(int j=0;j<23;j++)
                threetranadj[i][j]=0;
        
        for(int i=0;i<fourt;i++)
            for(int j=0;j<23;j++)
                fourtranadj[i][j]=0;
        
        for(int i=0;i<fivet;i++)
            for(int j=0;j<23;j++)
                fivetranadj[i][j]=0;
        
        for(int i=0;i<sixt;i++)
            for(int j=0;j<23;j++)
                sixtranadj[i][j]=0;
        
        for(int i=0;i<sevent;i++)
            for(int j=0;j<23;j++)
                seventranadj[i][j]=0;
        
        for(int i=0;i<at;i++)
            for(int j=0;j<23;j++)
                atranadj[i][j]=0;
        
        for(int i=0;i<bt;i++)
            for(int j=0;j<23;j++)
                btranadj[i][j]=0;
        
        for(int i=0;i<ct;i++)
            for(int j=0;j<23;j++)
                ctranadj[i][j]=0;
        
        for(int i=0;i<dt;i++)
            for(int j=0;j<23;j++)
                dtranadj[i][j]=0;
        
        for(int i=0;i<et;i++)
            for(int j=0;j<23;j++)
                etranadj[i][j]=0;
        
        for(int i=0;i<ft;i++)
            for(int j=0;j<23;j++)
                ftranadj[i][j]=0;
        
        for(int i=0;i<gt;i++)
            for(int j=0;j<23;j++)
                gtranadj[i][j]=0;
        
        for(int i=0;i<jt;i++)
            for(int j=0;j<23;j++)
                jtranadj[i][j]=0;
        
        for(int i=0;i<lt;i++)
            for(int j=0;j<23;j++)
                ltranadj[i][j]=0;
        
        for(int i=0;i<mt;i++)
            for(int j=0;j<23;j++)
                mtranadj[i][j]=0;
        
        for(int i=0;i<nt;i++)
            for(int j=0;j<23;j++)
                ntranadj[i][j]=0;
        
        for(int i=0;i<qt;i++)
            for(int j=0;j<23;j++)
                qtranadj[i][j]=0;
        
        for(int i=0;i<rt;i++)
            for(int j=0;j<23;j++)
                rtranadj[i][j]=0;
        
        for(int i=0;i<st;i++)
            for(int j=0;j<23;j++)
                stranadj[i][j]=0;
        
        for(int i=0;i<wt;i++)
            for(int j=0;j<23;j++)
                wtranadj[i][j]=0;
        
        for(int i=0;i<zt;i++)
            for(int j=0;j<23;j++)
                ztranadj[i][j]=0;
        
        onetranadj[0][7]=1; onetranadj[0][9]=1;
        onetranadj[1][1]=1; onetranadj[1][2]=1;
        onetranadj[2][1]=1; onetranadj[2][2]=1;
        onetranadj[3][1]=1; onetranadj[3][7]=1; onetranadj[3][8]=1; onetranadj[3][9]=1; onetranadj[3][10]=1;
        onetranadj[4][1]=1; onetranadj[4][2]=1; onetranadj[4][6]=1; onetranadj[4][7]=1; onetranadj[4][9]=1; onetranadj[4][11]=1; onetranadj[4][17]=1; onetranadj[4][18]=1;onetranadj[4][19]=1;onetranadj[4][21]=1;
        onetranadj[5][1]=1; onetranadj[5][2]=1;
        onetranadj[6][1]=1; onetranadj[6][2]=1; onetranadj[6][12]=1; onetranadj[6][15]=1; onetranadj[6][16]=1;
        onetranadj[7][1]=1; onetranadj[7][2]=1;
        onetranadj[8][19]=1; onetranadj[8][21]=1;
        
        twotranadj[0][4]=1;
        twotranadj[1][4]=1;
        twotranadj[2][4]=1;
        twotranadj[3][4]=1;
        twotranadj[4][4]=1;
        twotranadj[5][4]=1;
        twotranadj[6][4]=1; twotranadj[6][3]=1;
        twotranadj[7][2]=1;
        twotranadj[8][0]=1; twotranadj[8][2]=1;
        twotranadj[9][0]=1; twotranadj[9][2]=1;
        twotranadj[10][0]=1; twotranadj[10][7]=1; twotranadj[10][10]=1;
        twotranadj[11][0]=1; twotranadj[11][2]=1; twotranadj[11][6]=1; twotranadj[11][7]=1; twotranadj[11][9]=1; twotranadj[11][11]=1; twotranadj[11][17]=1; twotranadj[11][18]=1; twotranadj[11][19]=1; twotranadj[11][21]=1;
        twotranadj[12][0]=1; twotranadj[12][2]=1;
        twotranadj[13][0]=1; twotranadj[13][2]=1; twotranadj[13][12]=1; twotranadj[13][15]=1; twotranadj[13][16]=1;
        twotranadj[14][0]=1; twotranadj[14][2]=1;
        twotranadj[15][2]=1; twotranadj[15][7]=1; twotranadj[15][9]=1;
        twotranadj[16][2]=1; twotranadj[16][3]=1; twotranadj[16][4]=1; twotranadj[16][7]=1; twotranadj[16][9]=1; twotranadj[16][14]=1; twotranadj[16][22]=1;
        twotranadj[17][19]=1; twotranadj[17][2]=1; twotranadj[17][3]=1; twotranadj[17][4]=1;
        twotranadj[18][2]=1; twotranadj[18][3]=1; twotranadj[18][4]=1;
        twotranadj[19][8]=1; twotranadj[19][10]=1; twotranadj[19][17]=1; twotranadj[19][18]=1; twotranadj[19][19]=1; twotranadj[19][2]=1; twotranadj[19][3]=1; twotranadj[19][4]=1;
        twotranadj[20][20]=1; twotranadj[20][2]=1; twotranadj[20][3]=1; twotranadj[20][4]=1;
        twotranadj[21][4]=1;
        
        threetranadj[0][1]=1;
        threetranadj[1][0]=1; threetranadj[1][1]=1;
        threetranadj[2][0]=1; threetranadj[2][1]=1;
        threetranadj[3][7]=1; threetranadj[3][9]=1; threetranadj[3][11]=1; threetranadj[3][17]=1; threetranadj[3][18]=1; threetranadj[3][19]=1; threetranadj[3][20]=1; threetranadj[3][21]=1;
        threetranadj[4][0]=1; threetranadj[4][1]=1;
        threetranadj[5][12]=1; threetranadj[5][15]=1; threetranadj[5][16]=1; threetranadj[5][0]=1; threetranadj[5][1]=1;
        threetranadj[6][0]=1; threetranadj[6][1]=1;
        threetranadj[7][7]=1; threetranadj[7][9]=1; threetranadj[7][1]=1;
        threetranadj[8][7]=1; threetranadj[8][9]=1; threetranadj[8][14]=1; threetranadj[8][22]=1; threetranadj[8][1]=1; threetranadj[8][3]=1; threetranadj[8][4]=1;
        threetranadj[9][19]=1; threetranadj[9][1]=1; threetranadj[9][3]=1; threetranadj[9][4]=1;
        threetranadj[10][1]=1; threetranadj[10][3]=1; threetranadj[10][4]=1;
        threetranadj[11][8]=1; threetranadj[11][10]=1; threetranadj[11][17]=1; threetranadj[11][18]=1; threetranadj[11][19]=1; threetranadj[11][1]=1; threetranadj[11][3]=1; threetranadj[11][4]=1;
        threetranadj[12][20]=1; threetranadj[12][1]=1; threetranadj[12][3]=1; threetranadj[12][4]=1;
        threetranadj[13][3]=1;
        
        fourtranadj[0][8]=1; fourtranadj[0][10]=1;
        fourtranadj[1][1]=1; fourtranadj[1][4]=1;
        fourtranadj[2][4]=1;
        fourtranadj[3][4]=1; fourtranadj[3][5]=1;
        fourtranadj[4][4]=1; fourtranadj[4][5]=1;
        fourtranadj[5][17]=1; fourtranadj[5][19]=1; fourtranadj[5][21]=1; fourtranadj[5][4]=1; fourtranadj[5][5]=1; fourtranadj[5][12]=1;
        fourtranadj[6][11]=1; fourtranadj[6][16]=1; fourtranadj[6][5]=1;
        fourtranadj[7][20]=1; fourtranadj[7][4]=1; fourtranadj[7][5]=1; fourtranadj[7][6]=1;
        fourtranadj[8][15]=1; fourtranadj[8][17]=1; fourtranadj[8][18]=1; fourtranadj[8][19]=1; fourtranadj[8][21]=1; fourtranadj[8][4]=1; fourtranadj[8][5]=1;
        fourtranadj[9][10]=1; fourtranadj[9][12]=1; fourtranadj[9][5]=1;
        fourtranadj[10][14]=1; fourtranadj[10][17]=1; fourtranadj[10][18]=1; fourtranadj[10][22]=1; fourtranadj[10][21]=1; fourtranadj[10][5]=1;
        fourtranadj[11][14]=1; fourtranadj[11][22]=1; fourtranadj[11][4]=1; fourtranadj[11][5]=1;
        fourtranadj[12][7]=1; fourtranadj[12][9]=1; fourtranadj[12][14]=1; fourtranadj[12][22]=1; fourtranadj[12][1]=1; fourtranadj[12][2]=1; fourtranadj[12][4]=1;
        fourtranadj[13][4]=1;
        fourtranadj[14][17]=1; fourtranadj[14][19]=1; fourtranadj[14][1]=1; fourtranadj[14][2]=1; fourtranadj[14][4]=1;
        fourtranadj[15][1]=1; fourtranadj[15][2]=1; fourtranadj[15][4]=1;
        fourtranadj[16][8]=1; fourtranadj[16][10]=1; fourtranadj[16][17]=1; fourtranadj[16][18]=1; fourtranadj[16][19]=1; fourtranadj[16][1]=1; fourtranadj[16][2]=1; fourtranadj[16][4]=1;
        fourtranadj[17][20]=1; fourtranadj[17][1]=1; fourtranadj[17][2]=1; fourtranadj[17][4]=1;
        fourtranadj[18][2]=1;
        
        fivetranadj[0][1]=1;
        fivetranadj[1][1]=1;
        fivetranadj[2][1]=1;
        fivetranadj[3][1]=1;
        fivetranadj[4][1]=1; fivetranadj[4][3]=1;
        fivetranadj[5][3]=1;
        fivetranadj[6][3]=1; fivetranadj[6][5]=1;
        fivetranadj[7][3]=1; fivetranadj[7][5]=1;
        fivetranadj[8][17]=1; fivetranadj[8][19]=1; fivetranadj[8][21]=1; fivetranadj[8][3]=1; fivetranadj[8][5]=1; fivetranadj[8][12]=1;
        fivetranadj[9][20]=1; fivetranadj[9][3]=1; fivetranadj[9][5]=1; fivetranadj[9][6]=1;
        fivetranadj[10][15]=1; fivetranadj[10][17]=1; fivetranadj[10][18]=1; fivetranadj[10][19]=1; fivetranadj[10][3]=1; fivetranadj[10][5]=1;
        fivetranadj[11][14]=1; fivetranadj[11][22]=1; fivetranadj[11][3]=1; fivetranadj[11][5]=1;
        fivetranadj[12][7]=1; fivetranadj[12][9]=1; fivetranadj[12][14]=1; fivetranadj[12][22]=1; fivetranadj[12][1]=1; fivetranadj[12][2]=1; fivetranadj[12][3]=1;
        fivetranadj[13][3]=1;
        fivetranadj[14][3]=1;
        fivetranadj[15][19]=1; fivetranadj[15][1]=1; fivetranadj[15][2]=1; fivetranadj[15][3]=1;
        fivetranadj[16][1]=1; fivetranadj[16][2]=1; fivetranadj[16][3]=1;
        fivetranadj[17][8]=1; fivetranadj[17][10]=1; fivetranadj[17][17]=1; fivetranadj[17][18]=1; fivetranadj[17][19]=1; fivetranadj[17][1]=1; fivetranadj[17][2]=1; fivetranadj[17][3]=1;
        fivetranadj[18][20]=1; fivetranadj[18][1]=1; fivetranadj[18][2]=1; fivetranadj[18][3]=1;
        fivetranadj[19][1]=1;
        
        sixtranadj[0][3]=1; sixtranadj[0][4]=1;
        sixtranadj[1][3]=1; sixtranadj[1][4]=1;
        sixtranadj[2][17]=1; sixtranadj[2][19]=1; sixtranadj[2][21]=1; sixtranadj[2][3]=1; sixtranadj[2][4]=1; sixtranadj[2][12]=1;
        sixtranadj[3][11]=1; sixtranadj[3][16]=1; sixtranadj[3][3]=1;
        sixtranadj[4][20]=1; sixtranadj[4][3]=1; sixtranadj[4][4]=1; sixtranadj[4][6]=1;
        sixtranadj[5][15]=1; sixtranadj[5][17]=1; sixtranadj[5][18]=1; sixtranadj[5][19]=1; sixtranadj[5][21]=1; sixtranadj[5][3]=1; sixtranadj[5][4]=1;
        sixtranadj[6][8]=1; sixtranadj[6][10]=1; sixtranadj[6][12]=1; sixtranadj[6][16]=1; sixtranadj[6][3]=1;
        sixtranadj[7][14]=1; sixtranadj[7][17]=1; sixtranadj[7][18]=1; sixtranadj[7][19]=1; sixtranadj[7][21]=1; sixtranadj[7][22]=1; sixtranadj[7][3]=1;
        sixtranadj[8][14]=1; sixtranadj[8][22]=1; sixtranadj[8][3]=1; sixtranadj[8][4]=1;
        
        seventranadj[0][7]=1; seventranadj[0][9]=1; seventranadj[0][11]=1; seventranadj[0][17]=1; seventranadj[0][18]=1; seventranadj[0][19]=1; seventranadj[0][20]=1; seventranadj[0][21]=1; seventranadj[0][0]=1; seventranadj[0][1]=1; seventranadj[0][2]=1;
        seventranadj[1][8]=1; seventranadj[1][10]=1; seventranadj[1][12]=1; seventranadj[1][16]=1;
        seventranadj[2][20]=1; seventranadj[2][3]=1; seventranadj[2][4]=1; seventranadj[2][5]=1;
        seventranadj[3][11]=1; seventranadj[3][13]=1; seventranadj[3][16]=1;
        seventranadj[4][17]=1;
        seventranadj[5][11]=1; seventranadj[5][12]=1; seventranadj[5][16]=1; seventranadj[5][19]=1;
        
        atranadj[0][9]=1; atranadj[0][0]=1;
        atranadj[1][8]=1; atranadj[1][9]=1; atranadj[1][10]=1;
        atranadj[2][8]=1; atranadj[2][9]=1; atranadj[2][10]=1;
        atranadj[3][8]=1; atranadj[3][9]=1; atranadj[3][10]=1; atranadj[3][0]=1; atranadj[3][1]=1;
        atranadj[4][11]=1;
        atranadj[5][9]=1; atranadj[5][11]=1; atranadj[5][17]=1; atranadj[5][18]=1; atranadj[5][19]=1; atranadj[5][20]=1; atranadj[5][21]=1; atranadj[5][0]=1; atranadj[5][1]=1; atranadj[5][2]=1; atranadj[5][6]=1;
        atranadj[6][9]=1; atranadj[6][11]=1;
        atranadj[7][9]=1; atranadj[7][11]=1; atranadj[7][15]=1;
        atranadj[8][8]=1; atranadj[8][9]=1; atranadj[8][10]=1; atranadj[8][11]=1; atranadj[8][12]=1; atranadj[8][16]=1;
        atranadj[9][9]=1; atranadj[9][11]=1;
        atranadj[10][9]=1; atranadj[10][11]=1; atranadj[10][1]=1; atranadj[10][2]=1;
        atranadj[11][9]=1; atranadj[11][14]=1; atranadj[11][22]=1; atranadj[11][1]=1; atranadj[11][2]=1; atranadj[11][3]=1; atranadj[11][4]=1;
        atranadj[12][9]=1; atranadj[12][12]=1; atranadj[12][19]=1;
        atranadj[13][9]=1; atranadj[13][13]=1;
        atranadj[14][20]=1; 
        atranadj[15][9]=1;
        atranadj[16][9]=1;
        atranadj[17][9]=1; atranadj[17][14]=1; atranadj[17][15]=1; atranadj[17][22]=1;
        atranadj[18][9]=1;
        
        btranadj[0][10]=1;
        btranadj[1][10]=1;
        btranadj[2][10]=1;
        btranadj[3][3]=1;
        btranadj[4][7]=1; btranadj[4][9]=1; btranadj[4][10]=1;
        btranadj[5][7]=1; btranadj[5][9]=1; btranadj[5][10]=1;
        btranadj[6][7]=1; btranadj[6][9]=1; btranadj[6][10]=1; btranadj[6][0]=1;
        btranadj[7][10]=1; btranadj[7][11]=1;
        btranadj[8][10]=1; btranadj[8][12]=1; btranadj[8][16]=1;
        btranadj[9][10]=1; btranadj[9][12]=1; btranadj[9][16]=1; btranadj[9][6]=1;
        btranadj[10][10]=1; btranadj[10][12]=1; btranadj[10][16]=1; btranadj[10][17]=1; btranadj[10][18]=1; btranadj[10][19]=1; btranadj[10][21]=1;
        btranadj[11][7]=1; btranadj[11][9]=1; btranadj[11][10]=1; btranadj[11][11]=1; btranadj[11][12]=1; btranadj[11][16]=1;
        btranadj[12][10]=1; btranadj[12][12]=1; btranadj[12][16]=1; btranadj[12][5]=1;
        btranadj[13][10]=1;
        btranadj[14][18]=1; btranadj[14][19]=1;
        btranadj[15][10]=1; btranadj[15][17]=1; btranadj[15][18]=1; btranadj[15][19]=1; btranadj[15][1]=1; btranadj[15][2]=1; btranadj[15][3]=1; btranadj[15][4]=1;
        btranadj[16][18]=1;
        btranadj[17][18]=1; btranadj[17][20]=1;
        btranadj[18][18]=1;
        btranadj[19][18]=1;
        btranadj[20][18]=1;
        btranadj[21][18]=1;
        btranadj[22][18]=1;
        
        ctranadj[0][7]=1; ctranadj[0][0]=1;
        ctranadj[1][7]=1; ctranadj[1][8]=1; ctranadj[1][10]=1;
        ctranadj[2][7]=1; ctranadj[2][8]=1; ctranadj[2][10]=1;
        ctranadj[3][7]=1; ctranadj[3][8]=1; ctranadj[3][10]=1; ctranadj[3][0]=1;
        ctranadj[4][11]=1;
        ctranadj[5][7]=1; ctranadj[5][11]=1; ctranadj[5][17]=1; ctranadj[5][18]=1; ctranadj[5][19]=1; ctranadj[5][20]=1; ctranadj[5][21]=1; ctranadj[5][0]=1; ctranadj[5][1]=1; ctranadj[5][2]=1; ctranadj[5][6]=1;
        ctranadj[6][7]=1; ctranadj[6][11]=1;
        ctranadj[7][7]=1; ctranadj[7][11]=1; ctranadj[7][15]=1;
        ctranadj[8][7]=1; ctranadj[8][8]=1; ctranadj[8][10]=1; ctranadj[8][11]=1; ctranadj[8][12]=1; ctranadj[8][16]=1;
        ctranadj[9][7]=1; ctranadj[9][11]=1;
        ctranadj[10][7]=1; ctranadj[10][11]=1; ctranadj[10][1]=1; ctranadj[10][2]=1;
        ctranadj[11][9]=1; ctranadj[11][14]=1; ctranadj[11][22]=1; ctranadj[11][1]=1; ctranadj[11][2]=1; ctranadj[11][3]=1; ctranadj[11][4]=1;
        ctranadj[12][7]=1; ctranadj[12][12]=1; ctranadj[12][19]=1;
        ctranadj[13][7]=1; ctranadj[13][13]=1;
        ctranadj[14][20]=1;
        ctranadj[15][7]=1;
        ctranadj[16][7]=1;
        ctranadj[17][7]=1; ctranadj[17][14]=1; ctranadj[17][15]=1; ctranadj[17][22]=1;
        ctranadj[18][7]=1;
        
        dtranadj[0][8]=1;
        dtranadj[1][8]=1;
        dtranadj[2][8]=1;
        dtranadj[3][3]=1;
        dtranadj[4][7]=1; dtranadj[4][8]=1; dtranadj[4][9]=1;
        dtranadj[5][7]=1; dtranadj[5][8]=1; dtranadj[5][9]=1;
        dtranadj[6][7]=1; dtranadj[6][8]=1; dtranadj[6][9]=1; dtranadj[6][0]=1; dtranadj[6][1]=1;
        dtranadj[7][8]=1; dtranadj[7][11]=1;
        dtranadj[8][8]=1; dtranadj[8][12]=1; dtranadj[8][16]=1;
        dtranadj[9][8]=1; dtranadj[9][12]=1; dtranadj[9][16]=1; dtranadj[9][6]=1;
        dtranadj[10][8]=1; dtranadj[10][12]=1; dtranadj[10][16]=1; dtranadj[10][17]=1; dtranadj[10][18]=1; dtranadj[10][19]=1; dtranadj[10][21]=1;
        dtranadj[11][7]=1; dtranadj[11][8]=1; dtranadj[11][9]=1; dtranadj[11][11]=1; dtranadj[11][12]=1; dtranadj[11][16]=1;
        dtranadj[12][8]=1; dtranadj[12][12]=1; dtranadj[12][16]=1; dtranadj[12][3]=1; dtranadj[12][5]=1;
        dtranadj[13][8]=1;
        dtranadj[14][17]=1; dtranadj[14][18]=1; dtranadj[14][19]=1;
        dtranadj[15][8]=1; dtranadj[15][17]=1; dtranadj[15][18]=1; dtranadj[15][19]=1; dtranadj[15][1]=1; dtranadj[15][2]=1; dtranadj[15][3]=1; dtranadj[15][4]=1;
        dtranadj[16][19]=1;
        dtranadj[17][12]=1; dtranadj[17][13]=1; dtranadj[17][17]=1; dtranadj[17][19]=1;
        dtranadj[18][19]=1;
        dtranadj[19][19]=1;
        dtranadj[20][17]=1; dtranadj[20][19]=1;
        dtranadj[21][17]=1;
        dtranadj[22][12]=1; dtranadj[22][17]=1; dtranadj[22][18]=1;
        
        etranadj[0][14]=1; etranadj[0][22]=1;
        etranadj[1][14]=1; etranadj[1][22]=1;
        etranadj[2][12]=1;
        etranadj[3][12]=1;
        etranadj[4][12]=1; etranadj[4][16]=1; etranadj[4][19]=1;
        etranadj[5][12]=1; etranadj[5][16]=1; etranadj[5][19]=1; etranadj[5][6]=1;
        etranadj[6][16]=1; etranadj[6][19]=1;
        etranadj[7][13]=1; etranadj[7][16]=1; etranadj[7][6]=1;
        etranadj[8][16]=1; etranadj[8][3]=1; etranadj[8][5]=1;
        etranadj[9][16]=1;
        etranadj[10][8]=1; etranadj[10][10]=1;
        etranadj[11][7]=1; etranadj[11][9]=1;
        etranadj[12][7]=1; etranadj[12][9]=1; etranadj[12][17]=1; etranadj[12][18]=1; etranadj[12][19]=1; etranadj[12][20]=1; etranadj[12][21]=1; etranadj[12][1]=1; etranadj[12][0]=1; etranadj[12][2]=1; etranadj[12][6]=1;
        etranadj[13][7]=1; etranadj[13][9]=1;
        etranadj[14][7]=1; etranadj[14][9]=1; etranadj[14][15]=1;
        etranadj[15][7]=1; etranadj[15][8]=1; etranadj[15][9]=1; etranadj[15][10]=1; etranadj[15][12]=1; etranadj[15][16]=1;
        etranadj[16][7]=1; etranadj[16][9]=1;
        etranadj[17][7]=1; etranadj[17][9]=1; etranadj[17][1]=1; etranadj[17][2]=1;
        
        ftranadj[0][11]=1;
        ftranadj[1][11]=1;
        ftranadj[2][11]=1; ftranadj[2][16]=1; ftranadj[2][19]=1;
        ftranadj[3][11]=1; ftranadj[3][16]=1; ftranadj[3][19]=1; ftranadj[3][6]=1;
        ftranadj[4][17]=1; ftranadj[4][19]=1; ftranadj[4][3]=1; ftranadj[4][4]=1; ftranadj[4][5]=1;
        ftranadj[5][8]=1; ftranadj[5][10]=1; ftranadj[5][16]=1;
        ftranadj[6][8]=1; ftranadj[6][10]=1; ftranadj[6][16]=1; ftranadj[6][6]=1;
        ftranadj[7][8]=1; ftranadj[7][10]=1; ftranadj[7][16]=1; ftranadj[7][17]=1; ftranadj[7][18]=1; ftranadj[7][19]=1; ftranadj[7][21]=1;
        ftranadj[8][15]=1; ftranadj[8][16]=1; ftranadj[8][0]=1; ftranadj[8][1]=1; ftranadj[8][2]=1;
        ftranadj[9][7]=1; ftranadj[9][8]=1; ftranadj[9][9]=1; ftranadj[9][10]=1; ftranadj[9][11]=1; ftranadj[9][16]=1;
        ftranadj[10][8]=1; ftranadj[10][12]=1; ftranadj[10][16]=1; ftranadj[10][3]=1; ftranadj[10][5]=1;
        ftranadj[11][14]=1; ftranadj[11][16]=1; ftranadj[11][22]=1;
        ftranadj[12][7]=1; ftranadj[12][9]=1; ftranadj[12][19]=1;
        ftranadj[13][13]=1;
        ftranadj[14][13]=1;
        ftranadj[15][10]=1; ftranadj[15][13]=1; ftranadj[15][17]=1; ftranadj[15][19]=1; 
        ftranadj[16][13]=1;
        ftranadj[17][18]=1;
        ftranadj[18][10]=1; ftranadj[18][17]=1; ftranadj[18][18]=1;
        
        gtranadj[0][11]=1; gtranadj[0][6]=1; gtranadj[0][16]=1;
        gtranadj[1][15]=1;
        gtranadj[2][7]=1; gtranadj[2][9]=1;
        gtranadj[3][12]=1;
        gtranadj[4][12]=1;
        gtranadj[5][10]=1; gtranadj[5][12]=1; gtranadj[5][17]=1; gtranadj[5][19]=1;
        gtranadj[6][12]=1;
        
        jtranadj[0][7]=1; jtranadj[0][9]=1; jtranadj[0][1]=1; jtranadj[0][2]=1; jtranadj[0][3]=1; jtranadj[0][4]=1;
        jtranadj[1][3]=1; jtranadj[1][4]=1; jtranadj[1][5]=1;
        jtranadj[2][17]=1; jtranadj[2][18]=1; jtranadj[2][19]=1; jtranadj[2][21]=1; jtranadj[2][3]=1; jtranadj[2][5]=1;
        jtranadj[3][12]=1; jtranadj[3][16]=1;
        jtranadj[4][16]=1;
        jtranadj[5][16]=1;
        jtranadj[6][7]=1; jtranadj[6][9]=1; jtranadj[6][15]=1;
        jtranadj[7][11]=1;
        jtranadj[8][11]=1;
        
        ztranadj[0][7]=1; ztranadj[0][9]=1; ztranadj[0][1]=1; ztranadj[0][2]=1; ztranadj[0][3]=1; ztranadj[0][4]=1;
        ztranadj[1][3]=1; ztranadj[1][4]=1; ztranadj[1][5]=1;
        ztranadj[2][17]=1; ztranadj[2][18]=1; ztranadj[2][19]=1; ztranadj[2][21]=1; ztranadj[2][3]=1; ztranadj[2][5]=1;
        ztranadj[3][12]=1; ztranadj[3][16]=1;
        ztranadj[4][16]=1;
        ztranadj[5][16]=1;
        ztranadj[6][7]=1; ztranadj[6][9]=1; ztranadj[6][15]=1;
        ztranadj[7][11]=1;
        ztranadj[8][11]=1;
        
        ltranadj[0][7]=1; ltranadj[0][9]=1; ltranadj[0][11]=1;
        ltranadj[1][12]=1; ltranadj[1][16]=1; ltranadj[1][0]=1; ltranadj[1][1]=1; ltranadj[1][2]=1;
        ltranadj[2][17]=1; ltranadj[2][18]=1; ltranadj[2][19]=1; ltranadj[2][21]=1; ltranadj[2][3]=1; ltranadj[2][4]=1; ltranadj[2][5]=1;
        ltranadj[3][13]=1;
        ltranadj[4][16]=1;
        ltranadj[5][7]=1; ltranadj[5][9]=1; ltranadj[5][14]=1; ltranadj[5][22]=1;
        
        mtranadj[0][11]=1; mtranadj[0][12]=1; mtranadj[0][19]=1;
        mtranadj[1][11]=1; mtranadj[1][12]=1; mtranadj[1][19]=1; mtranadj[1][6]=1;
        mtranadj[2][11]=1; mtranadj[2][19]=1;
        mtranadj[3][11]=1; mtranadj[3][13]=1; mtranadj[3][6]=1;
        mtranadj[4][11]=1; mtranadj[4][5]=1;
        mtranadj[5][11]=1;
        mtranadj[6][8]=1; mtranadj[6][10]=1; mtranadj[6][12]=1;
        mtranadj[7][8]=1; mtranadj[7][10]=1; mtranadj[7][12]=1; mtranadj[7][6]=1;
        mtranadj[8][8]=1; mtranadj[8][10]=1; mtranadj[8][12]=1; mtranadj[8][17]=1; mtranadj[8][18]=1; mtranadj[8][19]=1; mtranadj[8][21]=1;
        mtranadj[9][12]=1; mtranadj[9][15]=1; mtranadj[9][0]=1; mtranadj[9][1]=1; mtranadj[9][2]=1;
        mtranadj[10][7]=1; mtranadj[10][8]=1; mtranadj[10][9]=1; mtranadj[10][10]=1; mtranadj[10][11]=1; mtranadj[10][12]=1;
        mtranadj[11][8]=1; mtranadj[11][10]=1; mtranadj[11][12]=1; mtranadj[11][3]=1; mtranadj[11][5]=1;
        mtranadj[12][12]=1; mtranadj[12][14]=1; mtranadj[12][22]=1;
        mtranadj[13][14]=1; mtranadj[13][22]=1;
        mtranadj[14][14]=1; mtranadj[14][22]=1;
        mtranadj[15][15]=1;
        
        ntranadj[0][21]=1;
        ntranadj[1][21]=1; ntranadj[1][6]=1;
        ntranadj[2][19]=1; ntranadj[2][21]=1; ntranadj[2][3]=1; ntranadj[2][4]=1; ntranadj[2][5]=1; ntranadj[2][12]=1;
        ntranadj[3][18]=1; ntranadj[3][19]=1; ntranadj[3][21]=1;
        ntranadj[4][7]=1; ntranadj[4][9]=1; ntranadj[4][11]=1; ntranadj[4][18]=1; ntranadj[4][19]=1; ntranadj[4][20]=1; ntranadj[4][21]=1; ntranadj[4][0]=1; ntranadj[4][1]=1; ntranadj[4][2]=1;
        ntranadj[5][8]=1; ntranadj[5][10]=1; ntranadj[5][12]=1; ntranadj[5][16]=1; ntranadj[5][18]=1; ntranadj[5][19]=1; ntranadj[5][21]=1;
        ntranadj[6][18]=1; ntranadj[6][19]=1; ntranadj[6][21]=1;
        ntranadj[7][18]=1; ntranadj[7][19]=1; ntranadj[7][21]=1;
        ntranadj[8][15]=1; ntranadj[8][18]=1; ntranadj[8][19]=1; ntranadj[8][21]=1; ntranadj[8][3]=1; ntranadj[8][4]=1; ntranadj[8][5]=1;
        ntranadj[9][18]=1; ntranadj[9][19]=1; ntranadj[9][21]=1;
        ntranadj[10][18]=1; ntranadj[10][19]=1; ntranadj[10][21]=1;
        ntranadj[11][14]=1; ntranadj[11][18]=1; ntranadj[11][19]=1; ntranadj[11][21]=1; ntranadj[11][22]=1; ntranadj[11][3]=1; ntranadj[11][5]=1;
        ntranadj[12][10]=1; ntranadj[12][18]=1;
        ntranadj[13][8]=1; ntranadj[13][10]=1; ntranadj[13][18]=1; ntranadj[13][19]=1; ntranadj[13][1]=1; ntranadj[13][2]=1; ntranadj[13][3]=1; ntranadj[13][4]=1;
        ntranadj[14][10]=1; ntranadj[14][12]=1; ntranadj[14][13]=1;
        ntranadj[15][10]=1; ntranadj[15][19]=1;
        ntranadj[16][19]=1;
        ntranadj[17][10]=1;
        ntranadj[18][10]=1; ntranadj[18][12]=1; ntranadj[18][18]=1;
        
        wtranadj[0][17]=1;
        wtranadj[1][17]=1; wtranadj[1][6]=1;
        wtranadj[2][19]=1; wtranadj[2][17]=1; wtranadj[2][3]=1; wtranadj[2][4]=1; wtranadj[2][5]=1; wtranadj[2][12]=1;
        wtranadj[3][18]=1; wtranadj[3][19]=1; wtranadj[3][17]=1;
        wtranadj[4][7]=1; wtranadj[4][9]=1; wtranadj[4][11]=1; wtranadj[4][18]=1; wtranadj[4][19]=1; wtranadj[4][20]=1; wtranadj[4][17]=1; wtranadj[4][0]=1; wtranadj[4][1]=1; wtranadj[4][2]=1;
        wtranadj[5][8]=1; wtranadj[5][10]=1; wtranadj[5][12]=1; wtranadj[5][16]=1; wtranadj[5][18]=1; wtranadj[5][19]=1; wtranadj[5][17]=1;
        wtranadj[6][18]=1; wtranadj[6][19]=1; wtranadj[6][17]=1;
        wtranadj[7][18]=1; wtranadj[7][19]=1; wtranadj[7][17]=1;
        wtranadj[8][15]=1; wtranadj[8][18]=1; wtranadj[8][19]=1; wtranadj[8][17]=1; wtranadj[8][3]=1; wtranadj[8][4]=1; wtranadj[8][5]=1;
        wtranadj[9][18]=1; wtranadj[9][19]=1; wtranadj[9][17]=1;
        wtranadj[10][18]=1; wtranadj[10][19]=1; wtranadj[10][17]=1;
        wtranadj[11][14]=1; wtranadj[11][18]=1; wtranadj[11][19]=1; wtranadj[11][17]=1; wtranadj[11][22]=1; wtranadj[11][3]=1; wtranadj[11][5]=1;
        wtranadj[12][0]=1;
        
        qtranadj[0][17]=1; qtranadj[0][19]=1; qtranadj[0][21]=1;
        qtranadj[1][17]=1;
        qtranadj[2][7]=1; qtranadj[2][9]=1; qtranadj[2][11]=1; qtranadj[2][17]=1; qtranadj[2][19]=1; qtranadj[2][20]=1; qtranadj[2][21]=1; qtranadj[2][0]=1; qtranadj[2][1]=1; qtranadj[2][2]=1; qtranadj[2][6]=1;
        qtranadj[3][8]=1; qtranadj[3][10]=1; qtranadj[3][12]=1; qtranadj[3][16]=1; qtranadj[3][17]=1; qtranadj[3][19]=1; qtranadj[3][21]=1;
        qtranadj[4][17]=1;
        qtranadj[5][17]=1;
        qtranadj[6][15]=1; qtranadj[6][17]=1; qtranadj[6][19]=1; qtranadj[6][21]=1; qtranadj[6][3]=1; qtranadj[6][4]=1; qtranadj[6][5]=1;
        qtranadj[7][17]=1;
        qtranadj[8][17]=1;
        qtranadj[9][14]=1; qtranadj[9][17]=1; qtranadj[9][19]=1; qtranadj[9][21]=1; qtranadj[9][22]=1; qtranadj[9][3]=1; qtranadj[9][5]=1;
        qtranadj[10][8]=1; qtranadj[10][12]=1; qtranadj[10][17]=1; qtranadj[10][19]=1;
        qtranadj[11][8]=1; qtranadj[11][12]=1; qtranadj[11][17]=1; qtranadj[11][19]=1; qtranadj[11][1]=1; qtranadj[11][2]=1; qtranadj[11][3]=1; qtranadj[11][4]=1;
        qtranadj[12][8]=1;
        qtranadj[13][8]=1; qtranadj[13][20]=1;
        qtranadj[14][8]=1;
        qtranadj[15][8]=1;
        qtranadj[16][8]=1;
        qtranadj[17][8]=1;
        qtranadj[18][8]=1;
        qtranadj[19][12]=1;
        qtranadj[20][10]=1; qtranadj[20][12]=1; qtranadj[20][17]=1;
        
        rtranadj[0][11]=1; rtranadj[0][12]=1; rtranadj[0][16]=1;
        rtranadj[1][11]=1; rtranadj[1][12]=1; rtranadj[1][16]=1; rtranadj[1][6]=1;
        rtranadj[2][11]=1; rtranadj[2][16]=1;
        rtranadj[3][17]=1; rtranadj[3][21]=1; rtranadj[3][3]=1; rtranadj[3][4]=1; rtranadj[3][5]=1; rtranadj[3][12]=1;
        rtranadj[4][17]=1; rtranadj[4][18]=1; rtranadj[4][21]=1;
        rtranadj[5][7]=1; rtranadj[5][9]=1; rtranadj[5][11]=1; rtranadj[5][17]=1; rtranadj[5][18]=1; rtranadj[5][20]=1; rtranadj[5][21]=1; rtranadj[5][0]=1; rtranadj[5][1]=1; rtranadj[5][2]=1;
        rtranadj[6][8]=1; rtranadj[6][10]=1; rtranadj[6][12]=1; rtranadj[6][16]=1; rtranadj[6][17]=1; rtranadj[6][18]=1; rtranadj[6][21]=1;
        rtranadj[7][15]=1; rtranadj[7][17]=1; rtranadj[7][18]=1; rtranadj[7][21]=1; rtranadj[7][3]=1; rtranadj[7][4]=1; rtranadj[7][5]=1;
        rtranadj[8][21]=1;
        rtranadj[9][21]=1;
        rtranadj[10][14]=1; rtranadj[10][17]=1; rtranadj[10][18]=1; rtranadj[10][21]=1; rtranadj[10][22]=1; rtranadj[10][5]=1;
        rtranadj[11][0]=1;
        rtranadj[12][1]=1; rtranadj[12][2]=1; rtranadj[12][3]=1; rtranadj[12][4]=1;
        rtranadj[13][7]=1; rtranadj[13][9]=1; rtranadj[13][12]=1;
        rtranadj[14][8]=1; rtranadj[14][18]=1;
        rtranadj[15][8]=1; rtranadj[15][10]=1; rtranadj[15][17]=1; rtranadj[15][18]=1; rtranadj[15][1]=1; rtranadj[15][2]=1; rtranadj[15][3]=1; rtranadj[15][4]=1;
        rtranadj[16][12]=1; rtranadj[16][13]=1;
        rtranadj[17][10]=1; rtranadj[17][17]=1;
        rtranadj[18][17]=1;
        
        stranadj[0][7]=1; stranadj[0][9]=1;
        stranadj[1][1]=1; stranadj[1][2]=1; stranadj[1][3]=1; stranadj[1][4]=1;
        stranadj[2][8]=1; stranadj[2][18]=1;
        
    }   
    
    String transferStn(String src, String[][] stations, String[] transfers, int[][] tranadj, int transferto){
        String temp="";
        String temp1="";
        int count1=0;
        int count2=0,index1=0,index2=0;
        for(int i=0;i<stations.length;i++){
            if(stations[i][0].equals(src)){
                index1=i;
                break;
            }
        }
        
        for(int i=index1;i<stations.length;i++){
            count1++;
            if(stations[i][1].equals("Yes")){
                temp1=stations[i][0];
                for(int j=0;j<transfers.length;j++){
                    if(transfers[j].equals(temp1)){
                        index2=j;
                        break;
                    }
                }
                if(tranadj[index2][transferto]==1){
                   temp=stations[i][0];
                   break;
                }
                
            }
        }
        
        for(int j=index1;j>=0;j--){
            count2++;
            if(stations[j][1].equals("Yes")){
                temp1=stations[j][0];
                for(int i=0;i<transfers.length;i++){
                    if(transfers[i].equals(temp1)){
                        index2=i;
                        break;
                    }
                }
                if(tranadj[index2][transferto]==1 && count2<count1){
                    temp=stations[j][0];
                    break;
                }
            }
        }
        
        return temp;
    }
    
    int transferToInt(String stn){
        switch(stn){
            case "One": return 0;
            case "Two": return 1;
            case "Three": return 2;
            case "Four": return 3;
            case "Five": return 4;
            case "Six": return 5;
            case "Seven": return 6;
            case "A": return 7;
            case "B": return 8;
            case "C": return 9;
            case "D": return 10;
            case "E": return 11;
            case "F": return 12;
            case "G": return 13;
            case "J": return 14;
            case "L": return 15;
            case "M": return 16;
            case "N": return 17;
            case "Q": return 18;
            case "R": return 19;
            case "S": return 20;
            case "W": return 21;
            case "Z": return 22;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner kbd=new Scanner(System.in);
        String srcStn,destStn,srcLine,destLine;
        String transfer=""; 
        String[][] temp1 = null;
        String[] temp2=null;
        int[][] temp3=null;
        int transInt=0;
        NewyorkSubway nsub=new NewyorkSubway();
        nsub.initRoutes();
        nsub.tranadj();
        nsub.inittran();
        
        srcStn=JOptionPane.showInputDialog("Source Station");
        srcLine=JOptionPane.showInputDialog("Source line");
        destStn=JOptionPane.showInputDialog("Destination Station");
        destLine=JOptionPane.showInputDialog("Destination Line");
        
        
        
        if(srcLine.equals(destLine)){
            System.out.println("");
            System.out.println("Take the next train from "+srcStn+" to "+destStn);
        }
        
        else{
            if((srcLine.equals("J") && destLine.equals("Z")) || (srcLine.equals("Z") && destLine.equals("J")) )
                System.out.println("No transfer required. Take the next train from "+srcStn+" to "+destStn);
            
            else if(srcLine.equals("One") && destLine.equals("Four")){
                transInt=nsub.transferToInt("Two");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to TwoLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.twoline, nsub.twotran,nsub.twotranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("Five")){
                transInt=nsub.transferToInt("Two");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to TwoLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.twoline, nsub.twotran,nsub.twotranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("Six")){
                transInt=nsub.transferToInt("R");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to RLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.rline, nsub.rtran,nsub.rtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("Seven")){
                transInt=nsub.transferToInt("Two");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to TwoLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.twoline, nsub.twotran,nsub.twotranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("G")){
                transInt=nsub.transferToInt("A");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to ALine at "+transfer); 
                if(transfer.equals("Times Sq-42 St"))
                    transfer="42 St-Port Authority Bus Terminal";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.aline, nsub.atran,nsub.atranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("J")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("One") && destLine.equals("Z")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.oneline, nsub.onetran, nsub.onetranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Two") && destLine.equals("Six")){
                transInt=nsub.transferToInt("Five");
                transfer=nsub.transferStn(srcStn, nsub.twoline, nsub.twotran, nsub.twotranadj,transInt);
                System.out.println("Transfer to FiveLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sixline, nsub.sixtran,nsub.sixtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Two") && destLine.equals("G")){
                transInt=nsub.transferToInt("A");
                transfer=nsub.transferStn(srcStn, nsub.twoline, nsub.twotran, nsub.twotranadj,transInt);
                System.out.println("Transfer to ALine at "+transfer); 
                if(transfer.equals("Times Sq-42 St"))
                    transfer="42 St-Port Authority Bus Terminal";
                else if(transfer.equals("Park Place"))
                    transfer="Broadway Junction";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.gline, nsub.gtran,nsub.gtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Three") && destLine.equals("Six")){
                transInt=nsub.transferToInt("Four");
                transfer=nsub.transferStn(srcStn, nsub.threeline, nsub.threetran, nsub.threetranadj,transInt);
                System.out.println("Transfer to FourLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sixline, nsub.sixtran,nsub.sixtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Three") && destLine.equals("G")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.threeline, nsub.threetran, nsub.threetranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                if(transfer.equals("Times Sq-42 St"))
                    transfer="42 St-Port Authority Bus Terminal";
                else if(transfer.equals("Park Place"))
                    transfer="Broadway Junction";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Four") && destLine.equals("One")){
                transInt=nsub.transferToInt("Two");
                transfer=nsub.transferStn(srcStn, nsub.fourline, nsub.fourtran, nsub.fourtranadj,transInt);
                System.out.println("Transfer to TwoLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.twoline, nsub.twotran,nsub.twotranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Four") && destLine.equals("G")){
                transInt=nsub.transferToInt("F");
                transfer=nsub.transferStn(srcStn, nsub.fourline, nsub.fourtran, nsub.fourtranadj,transInt);
                System.out.println("Transfer to FLine at "+transfer);
                if(transfer.equals("59 St"))
                    transfer="Lexington Av/63 St";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.fline, nsub.ftran,nsub.ftranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Five") && destLine.equals("One")){
                transInt=nsub.transferToInt("Two");
                transfer=nsub.transferStn(srcStn, nsub.fiveline, nsub.fivetran, nsub.fivetranadj,transInt);
                System.out.println("Transfer to TwoLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.twoline, nsub.twotran,nsub.twotranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Five") && destLine.equals("G")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.fiveline, nsub.fivetran, nsub.fivetranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Five") && destLine.equals("M")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.fiveline, nsub.fivetran, nsub.fivetranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Five") && destLine.equals("E")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.fiveline, nsub.fivetran, nsub.fivetranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("One")){
                transInt=nsub.transferToInt("R");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to RLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.rline, nsub.rtran,nsub.rtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("Two")){
                transInt=nsub.transferToInt("Five");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to FiveLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.fiveline, nsub.fivetran,nsub.fivetranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("Three")){
                transInt=nsub.transferToInt("Four");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to FourLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.fourline, nsub.fourtran,nsub.fourtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("A")){
                transInt=nsub.transferToInt("J");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to JLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.jline, nsub.jtran,nsub.jtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("C")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("G")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Six") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sixline, nsub.sixtran, nsub.sixtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Seven") && destLine.equals("J")){
                transInt=nsub.transferToInt("E");
                transfer=nsub.transferStn(srcStn, nsub.sevenline, nsub.seventran, nsub.seventranadj,transInt);
                System.out.println("Transfer to ELine at "+transfer); 
                if(transfer.equals("74 St-Broadway"))
                    transfer="Jackson Hts-Roosevelt Av";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.eline, nsub.etran,nsub.etranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Seven") && destLine.equals("L")){
                transInt=nsub.transferToInt("E");
                transfer=nsub.transferStn(srcStn, nsub.sevenline, nsub.seventran, nsub.seventranadj,transInt);
                System.out.println("Transfer to ELine at "+transfer); 
                if(transfer.equals("74 St-Broadway"))
                    transfer="Jackson Hts-Roosevelt Av";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.eline, nsub.etran,nsub.etranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Seven") && destLine.equals("Z")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sevenline, nsub.seventran, nsub.seventranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Seven") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sevenline, nsub.seventran, nsub.seventranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("A") && destLine.equals("Six")){
                transInt=nsub.transferToInt("J");
                transfer=nsub.transferStn(srcStn, nsub.aline, nsub.atran, nsub.atranadj,transInt);
                System.out.println("Transfer to JLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.jline, nsub.jtran,nsub.jtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("B") && destLine.equals("G")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.bline, nsub.btran, nsub.btranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                if(transfer.equals("42 St-Bryant Pk"))
                    transfer="Times Sq-42 St";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("B") && destLine.equals("J")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.bline, nsub.btran, nsub.btranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("B") && destLine.equals("L")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.bline, nsub.btran, nsub.btranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("B") && destLine.equals("Z")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.bline, nsub.btran, nsub.btranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("C") && destLine.equals("Six")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.cline, nsub.ctran, nsub.ctranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("D") && destLine.equals("J")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.dline, nsub.dtran, nsub.dtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("D") && destLine.equals("L")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.dline, nsub.dtran, nsub.dtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("D") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.dline, nsub.dtran, nsub.dtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("D") && destLine.equals("Z")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.dline, nsub.dtran, nsub.dtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("E") && destLine.equals("Five")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.eline, nsub.etran, nsub.etranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("F") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.fline, nsub.ftran, nsub.ftranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("One")){
                transInt=nsub.transferToInt("A");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to ALine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.aline, nsub.atran,nsub.atranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Two")){
                transInt=nsub.transferToInt("A");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to ALine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.aline, nsub.atran,nsub.atranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Three")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Four")){
                transInt=nsub.transferToInt("F");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to FLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.fline, nsub.ftran,nsub.ftranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Five")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Six")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("B")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("J")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Q")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("S")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("W")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("G") && destLine.equals("Z")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.gline, nsub.gtran, nsub.gtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("One")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("Seven")){
                transInt=nsub.transferToInt("E");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to ELine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.eline, nsub.etran,nsub.etranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("B")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("D")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("G")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("J") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.jline, nsub.jtran, nsub.jtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("L") && destLine.equals("Seven")){
                transInt=nsub.transferToInt("E");
                transfer=nsub.transferStn(srcStn, nsub.lline, nsub.ltran, nsub.ltranadj,transInt);
                System.out.println("Transfer to ELine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.eline, nsub.etran,nsub.etranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("L") && (destLine.equals("B") || destLine.equals("D") || destLine.equals("S"))){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.lline, nsub.ltran, nsub.ltranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("M") && destLine.equals("5")){
                transInt=nsub.transferToInt("Seven");
                transfer=nsub.transferStn(srcStn, nsub.mline, nsub.mtran, nsub.mtranadj,transInt);
                System.out.println("Transfer to SevenLine at "+transfer);
                if(transfer.equals("Jackson Hts-Roosevelt Av"))
                    transfer="74 St-Broadway";
                else if(transfer.equals("42 St-Bryant Pk"))
                    transfer="Times Sq-42 St";
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.sevenline, nsub.seventran,nsub.seventranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("M") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.mline, nsub.mtran, nsub.mtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("N") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.nline, nsub.ntran, nsub.ntranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Q") && destLine.equals("G")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.qline, nsub.qtran, nsub.qtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("R") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.rline, nsub.rtran, nsub.rtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("One")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("Six")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("Seven")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("D")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("E")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("F")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("G")){
                transInt=nsub.transferToInt("C");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to CLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.cline, nsub.ctran,nsub.ctranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("J")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("L")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("M")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("N")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("R")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("W")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("S") && destLine.equals("Z")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.sline, nsub.stran, nsub.stranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("W") && destLine.equals("G")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.wline, nsub.wtran, nsub.wtranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("W") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.wline, nsub.wtran, nsub.wtranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("One")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("Seven")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("B")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("D")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("G")){
                transInt=nsub.transferToInt("L");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to LLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.lline, nsub.ltran,nsub.ltranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("Z") && destLine.equals("S")){
                transInt=nsub.transferToInt("Q");
                transfer=nsub.transferStn(srcStn, nsub.zline, nsub.ztran, nsub.ztranadj,transInt);
                System.out.println("Transfer to QLine at "+transfer); 
                transInt=nsub.transferToInt(destLine);
                transfer=nsub.transferStn(transfer, nsub.qline, nsub.qtran,nsub.qtranadj,transInt);
                System.out.println("Train from "+transfer+" to "+destStn);
            }
            
            else if(srcLine.equals("N") && destLine.equals("W"))
                System.out.println("No transfer. Take next train from "+srcStn+" to "+destStn);
            
            else if(srcLine.equals("W") && destLine.equals("N"))
                System.out.println("No transfer. Take next train from "+srcStn+" to "+destStn);
            
            else if(srcLine.equals("J") && destLine.equals("Z"))
                System.out.println("No transfer. Take next train from "+srcStn+" to "+destStn);
            
            else if(srcLine.equals("Z") && destLine.equals("J"))
                System.out.println("No transfer. Take next train from "+srcStn+" to "+destStn);
            
            else{
                transInt=nsub.transferToInt(destLine);
                switch(srcLine){
                    case "One": temp1=nsub.oneline;
                    temp2=nsub.onetran;
                    temp3=nsub.onetranadj;
                                break;
                    case "Two": temp1=nsub.twoline;
                    temp2=nsub.twotran;
                    temp3=nsub.twotranadj;
                    break;
                    
                    case "Three": temp1=nsub.threeline;
                    temp2=nsub.threetran;
                    temp3=nsub.threetranadj;
                    break;
                    case "Four": temp1=nsub.fourline;
                    temp2=nsub.fourtran;
                    temp3=nsub.fourtranadj;
                    break;
                    case "Five": temp1=nsub.fiveline;
                    temp2=nsub.fivetran;
                    temp3=nsub.fivetranadj;
                    break;
                    case "Six": temp1=nsub.sixline;
                    temp2=nsub.sixtran;
                    temp3=nsub.sixtranadj;
                    break;
                    case "Seven": temp1=nsub.sevenline;
                    temp2=nsub.seventran;
                    temp3=nsub.seventranadj;
                    break;
                    case "A": temp1=nsub.aline;
                    temp2=nsub.atran;
                    temp3=nsub.atranadj;
                    break;
                    case "B": temp1=nsub.bline;
                    temp2=nsub.btran;
                    temp3=nsub.btranadj;
                    break;
                    case "C": temp1=nsub.cline;
                    temp2=nsub.ctran;
                    temp3=nsub.ctranadj;
                    break;
                    case "D": temp1=nsub.dline;
                    temp2=nsub.dtran;
                    temp3=nsub.dtranadj;
                    break;
                    case "E": temp1=nsub.eline;
                    temp2=nsub.etran;
                    temp3=nsub.etranadj;
                    break;
                    case "F": temp1=nsub.fline;
                    temp2=nsub.ftran;
                    temp3=nsub.ftranadj;
                    break;
                    case "G": temp1=nsub.gline;
                    temp2=nsub.gtran;
                    temp3=nsub.gtranadj;
                    break;
                    case "J": temp1=nsub.jline;
                    temp2=nsub.jtran;
                    temp3=nsub.jtranadj;
                    break;
                    case "L": temp1=nsub.lline;
                    temp2=nsub.ltran;
                    temp3=nsub.ltranadj;
                    break;
                    case "M": temp1=nsub.mline;
                    temp2=nsub.mtran;
                    temp3=nsub.mtranadj;
                    break;
                    case "N": temp1=nsub.nline;
                    temp2=nsub.ntran;
                    temp3=nsub.ntranadj;
                    break;
                    case "Q": temp1=nsub.qline;
                    temp2=nsub.qtran;
                    temp3=nsub.qtranadj;
                    break;
                    case "R": temp1=nsub.rline;
                    temp2=nsub.rtran;
                    temp3=nsub.rtranadj;
                    break;
                    case "S": temp1=nsub.rline;
                    temp2=nsub.stran;
                    temp3=nsub.stranadj;
                    break;
                    case "W": temp1=nsub.wline;
                    temp2=nsub.wtran;
                    temp3=nsub.wtranadj;
                    break;
                    case "Z": temp1=nsub.zline;
                    temp2=nsub.ztran;
                    temp3=nsub.ztranadj;
                    break;
                }
                transfer=nsub.transferStn(srcStn, temp1, temp2, temp3,transInt);
                System.out.println("Transfer to "+destLine+"line at "+transfer); 
                System.out.println("Train from "+transfer+" to "+destStn);
            }
        }
        
        
    }
    
}
