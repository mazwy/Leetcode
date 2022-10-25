UPDATE salary
SET sex = case when sex = 'f' then 'm' else 'f' end
