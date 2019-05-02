package me.beerhuntor.ardexmc.Inventories;

import me.beerhuntor.ardexmc.Items.RanksMenuItems;
import me.beerhuntor.ardexmc.Messages.Messages;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.UUID;


public class BuyRanks {


    // Lists for the Menus
    private ArrayList<UUID> ranks_Menu_List = new ArrayList<>();
    private ArrayList<UUID> member_Ranks_Menu_List = new ArrayList<>();
    private ArrayList<UUID> donator_Ranks_Menu_List = new ArrayList<>();
    private ArrayList<UUID> staff_Ranks_Menu_List = new ArrayList<>();
    // Instantiating items from the item class.
    private RanksMenuItems item = new RanksMenuItems();
    private Messages msg = new Messages();

    // Setting the inventory size
    //private int ranks_menu_size = 18;
    private int ui_Size = 27;

    // Inventory Titles
    private final String RANKS_TITLE = "§9§lRanks Shop";
    private final String MEMBER_RANKS_TITLE = "§9§lMember Ranks Shop";
    private final String DONATOR_RANKS_TITLE = "§9§lDonator Ranks Shop";
    private final String STAFF_RANKS_TITLE = "§9§lStaff Ranks Shop";

    // Instantiating the custom inventory of my inventory holder as the owner.
    private Inventory ranks = Bukkit.createInventory(new MyInventoryHolder(), ui_Size, RANKS_TITLE);
    private Inventory memberRanks = Bukkit.createInventory(new MyInventoryHolder(), ui_Size, MEMBER_RANKS_TITLE);
    private Inventory donatorRanks = Bukkit.createInventory(new MyInventoryHolder(), ui_Size,DONATOR_RANKS_TITLE);
    private Inventory staffRanks = Bukkit.createInventory(new MyInventoryHolder(), ui_Size, STAFF_RANKS_TITLE);

    // Methods to create the inventories
    public Inventory createRanksMenu() {
        int i;
        for (i = 0; i<ui_Size ; i++) {
            ranks.setItem(i, item.blankIcon());
        }
        ranks.setItem(10, item.memberIcon());
        ranks.setItem(13, item.donatorIcon());
        ranks.setItem(16, item.staffIcon());
        ranks.setItem(22, item.closeIcon());
        return ranks;
    }

    public Inventory createMemberRanksMenu () {
        int i;
        for (i = 0; i<ui_Size; i++) {
            memberRanks.setItem(i,item.blankIcon());
        }
        memberRanks.setItem(9, item.getMemberRankIcon());
        memberRanks.setItem(10, item.getArrivalIcon());
        memberRanks.setItem(11, item.getExplorerIcon());
        memberRanks.setItem(12, item.getCaptainIcon());
        memberRanks.setItem(13, item.getRangerIcon());
        memberRanks.setItem(14, item.getSpecialistIcon());
        memberRanks.setItem(15, item.getMercenaryIcon());
        memberRanks.setItem(16, item.getRoyalIcon());
        memberRanks.setItem(17, item.getSeasonalIcon());
        memberRanks.setItem(21, item.backIcon());
        memberRanks.setItem(23,item.forwardIcon());
        return memberRanks;
    }

    public Inventory createDonatorRanksMenu() {
        int i;
        for (i = 0; i<ui_Size; i++) {
            donatorRanks.setItem(i,item.blankIcon());
        }
        donatorRanks.setItem(10, item.getCorporalIcon());
        donatorRanks.setItem(13, item.getGeneralIcon());
        donatorRanks.setItem(16, item.getMarshalIcon());
        donatorRanks.setItem(21, item.backIcon());
        donatorRanks.setItem(23, item.forwardIcon());
        return donatorRanks;
    }

    public Inventory createStaffRanksMenu() {
        int i;
        for (i = 0; i<ui_Size; i++) {
            staffRanks.setItem(i,item.blankIcon());
        }
        staffRanks.setItem(10, item.getHelperIcon());
        staffRanks.setItem(13, item.getModIcon());
        staffRanks.setItem(16, item.getExecutiveIcon());
        staffRanks.setItem(21, item.backIcon());
        staffRanks.setItem(23, item.forwardIcon());
        return staffRanks;
    }

    public ArrayList<UUID> getRanksMenuList() {
        return ranks_Menu_List;
    }

    public ArrayList<UUID> getMemberMenuList() {
        return member_Ranks_Menu_List;
    }

    public ArrayList<UUID> getDonatorRanksList() {
        return donator_Ranks_Menu_List;
    }

    public ArrayList<UUID> getStaffRanksList () {
        return staff_Ranks_Menu_List;
    }

}
