package com.medical.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 512, nullable = false)
    private String timestamp;

    @Column(length = 512, nullable = false)
    private String status;

    @Column(length = 512, nullable = false)
    private Long userId;

    public Status(String timestamp, String status, Long user_id) {
        this.timestamp=timestamp;
        this.status=status;
        this.userId=user_id;
    }
}
