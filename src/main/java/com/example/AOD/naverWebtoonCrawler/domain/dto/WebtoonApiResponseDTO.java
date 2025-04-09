package com.example.AOD.naverWebtoonCrawler.domain.dto;

import java.util.List;
import lombok.Getter;

@Getter
public class WebtoonApiResponseDTO {
    private List<WebtoonApiDTO> webtoons;
    private int total;
    private boolean isLastPage;
}
