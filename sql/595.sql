-- 方法一，使用where子句和or
select name,population,area from world where area>3000000 or population>25000000;
-- 方法二，使用union，比方法一效率高一点
select name,population,area from world where area>3000000
union
select name,population,area from world where population>25000000;