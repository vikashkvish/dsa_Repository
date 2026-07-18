# Write your MySQL query statement below
With RankedScores as(
    select score,
    Dense_Rank() over (order by score desc) as score_rank
    From Scores
)
select score, score_rank as "rank"
 from RankedScores;
