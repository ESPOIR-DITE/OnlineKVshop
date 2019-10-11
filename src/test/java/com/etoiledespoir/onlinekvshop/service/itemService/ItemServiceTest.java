package com.etoiledespoir.onlinekvshop.service.itemService;

public class ItemServiceTest{}/** {
    private ItemService itemController= ItemServiceFactory.getItem();
    private Item item= ItemFactory.builItem("100012","trico","cloth");

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getItemService() {
        Assert.assertNotNull(itemController);
    }

    @Test
    public void creat() {
        System.out.println(itemController.creat(item).toString());
    }

    @Test
    public void delete() {
        System.out.println(itemController.delete("100013"));
    }

    @Test
    public void update() {
        System.out.println(itemController.Update(item).toString());
    }

    @Test
    public void read() {
        System.out.println(itemController.read("100012").toString());
    }

    @Test
    public void readAll() {
        ArrayList<String> myList=new ArrayList<>();
        myList=itemController.readAll();
        for(int i=0;i<myList.size();i++)
        {
        System.out.println(myList.get(i));}
    }

    @Test
    public void getPremier() {
    }
}*/