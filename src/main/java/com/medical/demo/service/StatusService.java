package com.medical.demo.service;
import com.medical.demo.dtos.StatusDTO;
import com.medical.demo.model.Status;
import com.medical.demo.model.mapper.StatusMapper;
import com.medical.demo.repository.StatusRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StatusService {
    private final StatusRepository statusRepository;
    private final StatusMapper statusMapper;


    public Status findById(Long id) {
        return statusRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Status not found: " + id));
    }

    public List<StatusDTO> getAllStatusesForUser(Long userId) {
        return statusRepository.findAllByUserIdEquals(userId).stream()
                .map(statusMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<StatusDTO> findAll() {
        return statusRepository.findAll().stream()
                .map(statusMapper::toDto)
                .collect(Collectors.toList());
    }
    public StatusDTO createStatus(StatusDTO statusDTO) {
        Status status = statusMapper.fromDto(statusDTO);
        return statusMapper.toDto(statusRepository.save(status));
    }

    public StatusDTO updateStatus(Long id, StatusDTO statusDTO) {
        Status existingStatus = findById(id);
        existingStatus.setTimestamp(statusDTO.getTimestamp());
        existingStatus.setStatus(statusDTO.getStatus());
        return statusMapper.toDto(statusRepository.save(existingStatus));
    }

    public void deleteStatus(Long id) {
        Status status = findById(id);
        statusRepository.delete(status);
    }
}