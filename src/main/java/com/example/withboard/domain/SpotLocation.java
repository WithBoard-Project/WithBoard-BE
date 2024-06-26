package com.example.withboard.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class SpotLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long locationId;

    @Column(nullable = false)
    private String parkName;

    @Column(precision = 10, scale = 2)
    private BigDecimal latitude;

    @Column(precision = 10, scale = 2)
    private BigDecimal longitude;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private String hotspotAddress;

    @OneToMany(mappedBy = "spotLocation", cascade = CascadeType.ALL)
    private List<TogetherPost> togetherPostList = new ArrayList<>();
}
