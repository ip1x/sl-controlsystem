package com.mrip1x.slcs.service;

import com.mrip1x.slcs.model.Channel;

import java.util.List;

public interface ChannelService {
    Channel findChannelById(Long id);

    List<Channel> findAllChannels();

    Channel save(Channel Channel);
    List<Channel> saveAll(List<Channel> channels);

    void delete(Channel Channel);
    void deleteById(Long id);
    void deleteAll();
}
