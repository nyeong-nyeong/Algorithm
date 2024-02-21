-- 업그레이드 할 수 없는 아이템 구하기

select 
	item_id as item_id ,
	item_name as item_name ,
	rarity as rarity
from ITEM_INFO 
	where not item_id in (
    SELECT 
    ITEM_TREE.parent_item_id 
    FROM ITEM_TREE 
    where ITEM_TREE.PARENT_ITEM_ID 
    is NOT NULL GROUP BY 
    ITEM_TREE.PARENT_ITEM_ID
    ) 	
    order by item_id desc;
    
    