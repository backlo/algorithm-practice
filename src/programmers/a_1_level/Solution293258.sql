SELECT count(*) FISH_COUNT
FROM FISH_INFO fi
WHERE fi.LENGTH IS NULL
GROUP BY fi.LENGTH
