select c.id, c.limit_account , c.balance  from customers c ;
select * from transactions t order by t.created_at desc ;

select sum(total_value), t.id
from transactions t
where t.id = 1
group by t.id ;




INSERT INTO public.transactions
(id, "type", description, total_value, created_at)
VALUES(1, 'c', 'sale', 1000, '2024-03-01 00:45:51.373');


INSERT INTO public.transactions
(id, "type", description, total_value, created_at)
VALUES(1, 'd', 'sale', -1000, '2024-03-01 00:45:51.373');

select
	1 as id,
	'd' as "type",
	'sale' as description,
	-1000 as total_value,
	now() as created_at
 where
 select sum(total_value) + 10000 -- limit
	from transactions t
	where t.id = 1
	;


with get_customer as (
							select sum(total_value) as balance, 10000 as new_transaction
								from transactions t
								where t.id = 1
								)
 -- insert
 insert into public.transactions (id, "type", description, total_value, created_at)
 select 1 as id,
 		'd' as "type",
 		'debit' as description,
 		get_customer.new_transaction as total_value,
 		now() as created_at
 		-- ,get_customer.balance, get_customer.new_transaction, get_customer.balance + get_customer.new_transaction
   from get_customer
   where get_customer.balance + get_customer.new_transaction >= -10000 -- limite do cliente é estático
;

















 with transaction_customer as (
                							select coalesce(sum(total_value), 0) as balance
                								from transactions t
                								where t.id = 1
                								)
                 --insert into public.transactions (id, "type", description, total_value, created_at)
                 select 1 as id,
                 		'c' as "type",
                 		'credit' as description,
                 		1 as total_value,
                 		now() as created_at
                 		,transaction_customer.balance
                 		,transaction_customer.balance + 1
                   from transaction_customer
                   where (transaction_customer.balance + 1) >= -100000
;





 select
	t.id, t.type, t.description, t.total_value, t.created_at
from transactions t
;



