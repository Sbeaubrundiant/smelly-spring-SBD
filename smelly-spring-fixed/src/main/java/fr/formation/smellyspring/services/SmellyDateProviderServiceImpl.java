package fr.formation.smellyspring.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class SmellyDateProviderServiceImpl implements SmellyDateProviderService {

    @Override
    public LocalDate getLocalDate() {
	return LocalDate.now();
    }

    @Override
    public LocalDateTime getLocalDateTime() {
	// Instead of IllegalArgumentException to be consistent in service layer
	throw new UnsupportedOperationException("well, not supported!");
    }
}
