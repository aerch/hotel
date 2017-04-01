package rf.erchenko;

/**
 * Created by 1 on 19.11.2016.
 */

class HotelRoom {
    private short counter;
    private String hotelroom;
    private boolean thenumberisbusy;
    private byte capacity;
    private float basepriceperday;
    private String thelist;
    private String singlebeddingset;
    private String doublebeddingset;
    private String familydoublebeddingset;
    private byte singlebed;
    private byte doublebed;
    private byte sofa;
    private byte chairbed;
    private byte desk;
    private byte coffeetable;
    private byte nightstand;
    private byte wardrobehallway;
    private byte chair;
    private byte bin;
    private byte chandelier;
    private byte sconce;
    private byte tablelamp;
    private byte setoftowels;
    private byte mirror;
    private byte carafe;
    private byte glass;
    private byte indoorantenna;
    private byte tvwithremotecontrol;
    private byte tunerwithremotecontrol;
    private byte painting;
    private byte floorrack;
    private byte wallhanger;
    private byte tvstand;

    public HotelRoom(short counter, String hotelroom, boolean thenumberisbusy, byte capacity, float basepriceperday, String thelist, String singlebeddingset, String doublebeddingset, String familydoublebeddingset, byte singlebed, byte doublebed, byte sofa, byte chairbed, byte desk, byte coffeetable, byte nightstand, byte wardrobehallway, byte chair, byte bin, byte chandelier, byte sconce, byte tablelamp, byte setoftowels, byte mirror, byte carafe, byte glass, byte indoorantenna, byte tvwithremotecontrol, byte tunerwithremotecontrol, byte painting, byte floorrack, byte wallhanger, byte tvstand) {
        this.counter = counter;
        this.hotelroom = hotelroom;
        this.thenumberisbusy = thenumberisbusy;
        this.capacity = capacity;
        this.basepriceperday = basepriceperday;
        this.thelist = thelist;
        this.singlebeddingset = singlebeddingset;
        this.doublebeddingset = doublebeddingset;
        this.familydoublebeddingset = familydoublebeddingset;
        this.singlebed = singlebed;
        this.doublebed = doublebed;
        this.sofa = sofa;
        this.chairbed = chairbed;
        this.desk = desk;
        this.coffeetable = coffeetable;
        this.nightstand = nightstand;
        this.wardrobehallway = wardrobehallway;
        this.chair = chair;
        this.bin = bin;
        this.chandelier = chandelier;
        this.sconce = sconce;
        this.tablelamp = tablelamp;
        this.setoftowels = setoftowels;
        this.mirror = mirror;
        this.carafe = carafe;
        this.glass = glass;
        this.indoorantenna = indoorantenna;
        this.tvwithremotecontrol = tvwithremotecontrol;
        this.tunerwithremotecontrol = tunerwithremotecontrol;
        this.painting = painting;
        this.floorrack = floorrack;
        this.wallhanger = wallhanger;
        this.tvstand = tvstand;
    }

    public short getCounter() {
        return counter;
    }

    public void setCounter(short counter) {
        this.counter = counter;
    }

    public String getHotelroom() {
        return hotelroom;
    }

    public void setHotelroom(String hotelroom) {
        this.hotelroom = hotelroom;
    }

    public boolean isThenumberisbusy() {
        return thenumberisbusy;
    }

    public void setThenumberisbusy(boolean thenumberisbusy) {
        this.thenumberisbusy = thenumberisbusy;
    }

    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    public float getBasepriceperday() {
        return basepriceperday;
    }

    public void setBasepriceperday(float basepriceperday) {
        this.basepriceperday = basepriceperday;
    }

    public String getThelist() {
        return thelist;
    }

    public void setThelist(String thelist) {
        this.thelist = thelist;
    }

    public String getSinglebeddingset() {
        return singlebeddingset;
    }

    public void setSinglebeddingset(String singlebeddingset) {
        this.singlebeddingset = singlebeddingset;
    }

    public String getDoublebeddingset() {
        return doublebeddingset;
    }

    public void setDoublebeddingset(String doublebeddingset) {
        this.doublebeddingset = doublebeddingset;
    }

    public String getFamilydoublebeddingsetdoublebeddingset() {
        return familydoublebeddingset;
    }

    public void setFamilydoublebeddingset(String familydoublebeddingset) {
        this.familydoublebeddingset = familydoublebeddingset;
    }

    public byte getSinglebed() {
        return singlebed;
    }

    public void setSinglebed(byte singlebed) {
        this.singlebed = singlebed;
    }

    public byte getDoublebed() {
        return doublebed;
    }

    public void setDoublebed(byte doublebed) {
        this.doublebed = doublebed;
    }

    public byte getSofa() {
        return sofa;
    }

    public void setSofa(byte sofa) {
        this.sofa = sofa;
    }

    public byte getChairbed() {
        return chairbed;
    }

    public void setChairbed(byte chairbed) {
        this.chairbed = chairbed;
    }

    public byte getDesk() {
        return desk;
    }

    public void setDesk(byte desk) {
        this.desk = desk;
    }

    public byte getCoffeetable() {
        return coffeetable;
    }

    public void setCoffeetable(byte coffeetable) {
        this.coffeetable = coffeetable;
    }

    public byte getNightstand() {
        return nightstand;
    }

    public void setNightstand(byte nightstand) {
        this.nightstand = nightstand;
    }

    public byte getWardrobehallway() {
        return wardrobehallway;
    }

    public void setWardrobehallway(byte wardrobehallway) {
        this.wardrobehallway = wardrobehallway;
    }

    public byte getChair() {
        return chair;
    }

    public void setChair(byte chair) {
        this.chair = chair;
    }

    public byte getBin() {
        return bin;
    }

    public void setBin(byte bin) {
        this.bin = bin;
    }

    public byte getChandelier() {
        return chandelier;
    }

    public void setChandelier(byte chandelier) {
        this.chandelier = chandelier;
    }

    public byte getSconce() {
        return sconce;
    }

    public void setSconce(byte sconce) {
        this.sconce = sconce;
    }

    public byte getTablelamp() {
        return tablelamp;
    }

    public void setTablelamp(byte tablelamp) {
        this.tablelamp = tablelamp;
    }

    public byte getSetoftowels() {
        return setoftowels;
    }

    public void setSetoftowels(byte setoftowels) {
        this.setoftowels = setoftowels;
    }

    public byte getMirror() {
        return mirror;
    }

    public void setMirror(byte mirror) {
        this.mirror = mirror;
    }

    public byte getCarafe() {
        return carafe;
    }

    public void setCarafe(byte carafe) {
        this.carafe = carafe;
    }

    public byte getGlass() {
        return glass;
    }

    public void setGlass(byte glass) {
        this.glass = glass;
    }

    public byte getIndoorantenna() {
        return indoorantenna;
    }

    public void setIndoorantenna(byte indoorantenna) {
        this.indoorantenna = indoorantenna;
    }

    public byte getTvwithremotecontrol() {
        return tvwithremotecontrol;
    }

    public void setTvwithremotecontrol(byte tvwithremotecontrol) {
        this.tvwithremotecontrol = tvwithremotecontrol;
    }

    public byte getTunerwithremotecontrol() {
        return tunerwithremotecontrol;
    }

    public void setTunerwithremotecontrol(byte tunerwithremotecontrol) {
        this.tunerwithremotecontrol = tunerwithremotecontrol;
    }

    public byte getPainting() {
        return painting;
    }

    public void setPainting(byte painting) {
        this.painting = painting;
    }

    public byte getFloorrack() {
        return floorrack;
    }

    public void setFloorrack(byte floorrack) {
        this.floorrack = floorrack;
    }

    public byte getWallhanger() {
        return wallhanger;
    }

    public void setWallhanger(byte wallhanger) {
        this.wallhanger = wallhanger;
    }

    public byte getTvstand() {
        return tvstand;
    }

    public void setTvstand(byte tvstand) {
        this.tvstand = tvstand;
    }

    @Override
    public String toString() {
        return "Номер " + hotelroom + ",  вместимостью  -  " + capacity + ( capacity > 1 ? " места" : " место");
    }
}
