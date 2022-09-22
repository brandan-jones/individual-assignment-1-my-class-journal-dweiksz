package edu.uc.cech.soit.myclassjournal.service;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class JournalService implements IJournalService {
    List<JournalEntry> list = new ArrayList<>();
    @Override
    public List<JournalEntry> fetchAll() {
        return list;
    }
    @Override
    public void save(JournalEntry journalEntry) {
        list.add(journalEntry);
    }
}
