package com.xiaomi.infra.galaxy.emq.client;

/**
 * Copyright 2020, Xiaomi.
 * All rights reserved.
 * Author: shanzhongkai@xiaomi.com
 */
public class EMQClientConfigKeys {
  /**
   * endpoint
   */
  public static final String GALAXY_EMQ_SERVICE_ENDPOINT =
      "galaxy.emq.service.endpoint";
  public static final String GALAXY_EMQ_SERVICE_ENDPOINT_DEFAULT =
      null;

  /**
   * client端请求超时时间（ms）
   */
  public static final String GALAXY_EMQ_CLIENT_TIMEOUT =
      "galaxy.emq.client.timeout";
  public static final int GALAXY_EMQ_CLIENT_TIMEOUT_DEFAULT =
      60000;

  /**
   * client端连接超时时间（ms）
   */
  public static final String GALAXY_EMQ_CLIENT_CONN_TIMEOUT =
      "galaxy.emq.client.conn.timeout";
  public static final int GALAXY_EMQ_CLIENT_CONN_TIMEOUT_DEFAULT =
      30000;

  /**
   * auto retry or not
   */
  public static final String GALAXY_EMQ_CLIENT_AUTO_RETRY =
      "galaxy.emq.client.auto.retry";
  public static final boolean GALAXY_EMQ_CLIENT_AUTO_RETRY_DEFAULT =
      false;

  /**
   * max retry number
   */
  public static final String GALAXY_EMQ_CLIENT_RETRY_NUMBER =
      "galaxy.emq.client.retry.number";
  public static final int GALAXY_EMQ_CLIENT_RETRY_NUMBER_DEFAULT =
      3;

  /**
   * message delay seconds in this queue, default 0s (0s ~ 4day)
   */
  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_QUEUE_DELAY_SECONDS_MAXIMAL = 4 * 86400;

  /**
   * message invisibility seconds in this queue, default 30s (1s ~ 12hour)
   */
  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_DEFAULT = 30;

  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MINIMAL = 2;

  public static final int GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS_MAXIMAL = 43200;

  /**
   * receive message seconds in this queue, default 0s which means no wait (0s ~ 20s)
   */
  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_WAIT_SECONDS_MAXIMAL = 20;

  /**
   * maximum receive message number in this queue, default 100(1 ~ 100)
   */
  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_DEFAULT = 100;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MINIMAL = 1;

  public static final int GALAXY_EMQ_QUEUE_RECEIVE_NUMBER_MAXIMAL = 100;

  /**
   * message retention seconds in this queue, default 4days (60s ~ 14days)
   */
  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_DEFAULT = 345600;

  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MINIMAL = 60;

  public static final int GALAXY_EMQ_QUEUE_RETENTION_SECONDS_MAXIMAL = 1209600;

  /**
   * max message size in this queue, default 256K (1K ~ 256K)
   */
  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_DEFAULT = 262144;

  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MINIMAL = 1024;

  public static final int GALAXY_EMQ_QUEUE_MAX_MESSAGE_BYTES_MAXIMAL = 262144;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_DEFAULT = 4;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MINIMAL = 1;

  public static final int GALAXY_EMQ_QUEUE_PARTITION_NUMBER_MAXIMAL = 255;

  /**
   * message delay seconds that overwrite GALAXY_EMQ_QUEUE_DELAY_SECONDS,
   * default 0s (0s ~ 90 day)
   */
  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_DEFAULT = 0;

  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MINIMAL = 0;

  public static final int GALAXY_EMQ_MESSAGE_DELAY_SECONDS_MAXIMAL = 90 * 86400;

  /**
   * message invisibility seconds that overwrite
   * GALAXY_EMQ_QUEUE_INVISIBILITY_SECONDS, default 30s (0s ~ 12hour)
   */
  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_DEFAULT = 30;

  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MINIMAL = 2;

  public static final int GALAXY_EMQ_MESSAGE_INVISIBILITY_SECONDS_MAXIMAL = 43200;

  /**
   * queue read qps, default 50 (0 ~ 100000)
   */
  public static final long GALAXY_EMQ_QUEUE_READ_QPS_DEFAULT = 50L;

  public static final long GALAXY_EMQ_QUEUE_READ_QPS_MINIMAL = 0L;

  public static final long GALAXY_EMQ_QUEUE_READ_QPS_MAXIMAL = 100000L;

  /**
   * queue write qps, default 50 (0 ~ 100000)
   */
  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_DEFAULT = 50L;

  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_MINIMAL = 0L;

  public static final long GALAXY_EMQ_QUEUE_WRITE_QPS_MAXIMAL = 100000L;

  /**
   * queue redrive policy max receive time, default 2 (1 ~ 100)
   */
  public static final int GALAXY_EMQ_QUEUE_REDRIVE_POLICY_MAX_RECEIVE_TIME_DEFAULT = 2;

  public static final int GALAXY_EMQ_QUEUE_REDRIVE_POLICY_MAX_RECEIVE_TIME_MINIMAL = 1;

  public static final int GALAXY_EMQ_QUEUE_REDRIVE_POLICY_MAX_RECEIVE_TIME_MAXIMAL = 100;


}