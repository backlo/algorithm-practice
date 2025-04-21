SELECT count(*) FISH_COUNT
FROM FISH_INFO fi
WHERE date_format(fi.TIME, '%Y') = 2021
