package com.mrip1x.slcs.service.impl;

import com.mrip1x.slcs.model.Channel;
import com.mrip1x.slcs.repository.ChannelRepository;
import com.mrip1x.slcs.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelRepository repository;

    @Override
    public Channel findChannelById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Channel> findAllChannels() {
        return repository.findAll();
    }

    @Override
    public Channel save(Channel Channel) {
        return repository.save(Channel);
    }

    @Override
    public List<Channel> saveAll(List<Channel> channels) {
        return repository.save(channels);
    }

    @Override
    public void delete(Channel Channel) {
        repository.delete(Channel);
    }

    @Override
    public void deleteById(Long id) {
        repository.delete(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
