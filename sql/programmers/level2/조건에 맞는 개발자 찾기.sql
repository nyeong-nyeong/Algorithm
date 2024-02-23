SELECT DISTINCT a.ID, a.EMAIL, a.FIRST_NAME, a.LAST_NAME
FROM DEVELOPERS a, SKILLCODES b
WHERE 
    1=1
    AND (a.SKILL_CODE & b.CODE) > 0
    AND b.NAME IN ("Python", "C#")
ORDER BY a.ID;

-- 비트 연산자에 대해서 다시금 공부하게 되는 계기