package BasicLLD.DesignPattern.Behavioral.State.VendingStates;

public class Inventory {
    ItemShelf[] inventory=null;


    Inventory(int itemCount){
        inventory=new ItemShelf[itemCount];
        initialEmptyInventory();
    }



    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }
    public void initialEmptyInventory(){
        int startCode=101;

        for(int i=0;i<inventory.length;i++){
            ItemShelf space=new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]=space;
            startCode++;
        }
    }
    public void addItem(Item item,int codeNumber) throws Exception{

        for(ItemShelf itemShelf:inventory){
            if(itemShelf.code==codeNumber){
                if(itemShelf.isSoldOut()==true){
                    itemShelf.setSoldOut(false);
                    itemShelf.setItem(item);

                }
                else{
                    throw new Exception("Item is already present you can't add here!");
                }
            }
        }

    }

    public Item getItem(int code) throws Exception{
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.getCode()==code){
                if(itemShelf.isSoldOut()){
                    throw  new Exception("Item is sold out");
                }
                else{
                    return itemShelf.getItem();
                }

            }
        }
        throw  new Exception("Invalid code!");
    }

    public void updateSoldOutItem(int code){
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.getCode()==code){
                itemShelf.setSoldOut(true);
            }
        }
    }
}
